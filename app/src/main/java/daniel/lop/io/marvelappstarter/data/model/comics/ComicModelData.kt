package daniel.lop.io.marvelappstarter.data.model.comics

import com.google.gson.annotations.SerializedName
import daniel.lop.io.marvelappstarter.data.model.characters.CharacterModel
import java.io.Serializable

data class ComicModelData(

    @SerializedName("results")
    val listComic: List<ComicModel>

) : Serializable
