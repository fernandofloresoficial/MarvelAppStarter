package daniel.lop.io.marvelappstarter.data.model.comics

import com.google.gson.annotations.SerializedName
import daniel.lop.io.marvelappstarter.data.model.characters.CharacterDataModel
import java.io.Serializable

data class ComicResponseModel(

    @SerializedName("data")
    val comicData: ComicDataModel

) : Serializable
