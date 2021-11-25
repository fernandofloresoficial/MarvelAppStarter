package daniel.lop.io.marvelappstarter.data.model.characters

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterResponseModel(

    @SerializedName("data")
    val characterData: CharacterDataModel

) : Serializable
