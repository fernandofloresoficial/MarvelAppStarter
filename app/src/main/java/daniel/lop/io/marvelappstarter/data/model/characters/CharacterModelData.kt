package daniel.lop.io.marvelappstarter.data.model.characters

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterModelData(

    @SerializedName("results")
    val listCharacter: List<CharacterModel>

) : Serializable
