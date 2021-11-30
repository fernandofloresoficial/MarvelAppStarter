package daniel.lop.io.marvelappstarter.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import daniel.lop.io.marvelappstarter.R
import daniel.lop.io.marvelappstarter.data.model.characters.CharacterModel
import daniel.lop.io.marvelappstarter.data.model.comics.ComicModel
import daniel.lop.io.marvelappstarter.databinding.ItemCharacterBinding
import daniel.lop.io.marvelappstarter.databinding.ItemComicBinding
import daniel.lop.io.marvelappstarter.util.limitDescription

class ComicAdapter : RecyclerView.Adapter<ComicAdapter.ComicViewHolder>() {

    inner class ComicViewHolder(val binding: ItemComicBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val differCallBack = object : DiffUtil.ItemCallback<ComicModel>() {
        override fun areItemsTheSame(oldItem: ComicModel, newItem: ComicModel): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: ComicModel, newItem: ComicModel): Boolean {
            return oldItem.id == newItem.id
                    && oldItem.tittle == newItem.tittle
                    && oldItem.description == newItem.description
                    && oldItem.thumbnail.path == newItem.thumbnail.extension
                    && oldItem.thumbnail.extension == newItem.thumbnail.extension
        }
    }

    private val differ = AsyncListDiffer(this, differCallBack)

    var listComics: List<ComicModel>
        get() = differ.currentList
        set(value) = differ.submitList(value)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        return ComicViewHolder(
            ItemComicBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = listComics.size

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        val comic = listComics[position]
        holder.binding.apply {
            tvNameComic.text = comic.tittle
            tvDescriptionComic.text = comic.description

            Glide.with(holder.itemView.context)
                .load(comic.thumbnail.path + "." + comic.thumbnail.extension)
                .into(imgComic)
        }

    }
    
}