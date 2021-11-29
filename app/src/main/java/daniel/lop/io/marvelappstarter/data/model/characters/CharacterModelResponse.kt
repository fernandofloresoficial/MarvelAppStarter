package daniel.lop.io.marvelappstarter.data.model.characters

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterModelResponse(

    @SerializedName("data")
    val characterData: CharacterModelData

) : Serializable
