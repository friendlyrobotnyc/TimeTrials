package friendlyrobot.nyc.timetrials

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookSearchResponse(
    val num_found : Int,
    val docs : Array<BookDocument>
)


@JsonClass(generateAdapter = true)
data class BookDocument(
    val title : String,
    val oclc : Array<String>?
) {
    fun toBook() = Book(title)
}

@JsonClass(generateAdapter = true)
data class Book(
    val title: String
)


val silly = "{\"start\":0,\"num_found\":336,\"numFound\":336,\"docs\":[{\"title_suggest\":\"Heinlein's Children\",\"edition_key\":[\"OL8318159M\"],\"isbn\":[\"9780911682342\",\"0911682341\"],\"has_fulltext\":false,\"text\":[\"OL8318159M\",\"9780911682342\",\"0911682341\",\"Joseph T. Major\",\"68967264\",\"OL2927754A\",\"The Juveniles\",\"Heinlein's Children\",\"/works/OL8672293W\",\"Advent Publishers\"],\"author_name\":[\"Joseph T. Major\"],\"seed\":[\"/books/OL8318159M\",\"/works/OL8672293W\",\"/authors/OL2927754A\"],\"oclc\":[\"68967264\"],\"author_key\":[\"OL2927754A\"],\"title\":\"Heinlein's Children\",\"publish_date\":[\"2006\"],\"type\":\"work\",\"ebook_count_i\":0,\"edition_count\":1,\"key\":\"/works/OL8672293W\",\"id_goodreads\":[\"342060\"],\"publisher\":[\"Advent Publishers\"],\"language\":[\"eng\"],\"last_modified_i\":1303893317,\"id_librarything\":[\"1416300\"],\"publish_year\":[2006],\"first_publish_year\":2006},{\"title_suggest\":\"Michael Heinlein\",\"edition_key\":[\"OL1138589M\"],\"isbn\":[\"9783894220600\",\"3894220600\"],\"has_fulltext\":false,\"text\":[\"OL1138589M\",\"9783894220600\",\"3894220600\",\"Michael Heinlein\",\"Pfalzgalerie Kaiserslautern.\",\"OL598610A\",\"viaggio : Studioausstellung, 4. August bis 13. September 1992\",\"Michael Heinlein\",\"[Ausstellung und Katalog] Pfalzgalerie Kaiserslautern.\",\"Exhibitions\",\"/works/OL3556820W\",\"Die Galerie\",\"Viaggio.\",\"94106818\",\"Michael Heinlein (1953-)\"],\"author_name\":[\"Michael Heinlein\"],\"seed\":[\"/books/OL1138589M\",\"/works/OL3556820W\",\"/subjects/exhibitions\",\"/subjects/person:michael_heinlein_(1953-)\",\"/authors/OL598610A\"],\"contributor\":[\"Pfalzgalerie Kaiserslautern.\"],\"author_key\":[\"OL598610A\"],\"subject\":[\"Exhibitions\"],\"title\":\"Michael Heinlein\",\"publish_date\":[\"1992\"],\"type\":\"work\",\"ebook_count_i\":0,\"publish_place\":[\"[Kaiserslautern]\"],\"edition_count\":1,\"key\":\"/works/OL3556820W\",\"publisher\":[\"Die Galerie\"],\"language\":[\"ger\"],\"lccn\":[\"94106818\"],\"last_modified_i\":1266360735,\"person\":[\"Michael Heinlein (1953-)\"],\"publish_year\":[1992],\"first_publish_year\":1992},{\"title_suggest\":\"Robert Heinlein\",\"edition_key\":[\"OL14734234M\"],\"isbn\":[\"9781871133356\",\"1871133351\"],\"has_fulltext\":false,\"text\":[\"OL14734234M\",\"9781871133356\",\"1871133351\",\"Phil Stephensen-Payne\",\"OL81480A\",\"stormtrooping guru : a working bibliography\",\"Robert Heinlein\",\"by Phil Stephensen-Payne.\",\"English fiction\",\"/works/OL922281W\",\"P. Stephensen-Payne\",\"Robert A. Heinlein (1907-1988)\",\"United States\"],\"author_name\":[\"Phil Stephensen-Payne\"],\"seed\":[\"/books/OL14734234M\",\"/works/OL922281W\",\"/subjects/english_fiction\",\"/subjects/person:robert_a._heinlein_(1907-1988)\",\"/subjects/place:united_states\",\"/authors/OL81480A\"],\"author_key\":[\"OL81480A\"],\"subject\":[\"English fiction\"],\"title\":\"Robert Heinlein\",\"publish_date\":[\"1993\"],\"type\":\"work\",\"ebook_count_i\":0,\"publish_place\":[\"Leeds\"],\"edition_count\":1,\"key\":\"/works/OL922281W\",\"id_goodreads\":[\"2527483\"],\"publisher\":[\"P. Stephensen-Payne\"],\"language\":[\"eng\"],\"last_modified_i\":1291380935,\"person\":[\"Robert A. Heinlein (1907-1988)\"],\"publish_year\":[1993],\"first_publish_year\":1993,\"place\":[\"United States\"]},{\"title_suggest\":\"A Heinlein trio\",\"edition_key\":[\"OL23765106M\",\"OL17579004M\",\"OL16501447M\",\"OL24397033M\"],\"cover_i\":6651839,\"subtitle\":\"The Puppet Masters, Double Star, The Door into Summer\",\"has_fulltext\":true,\"text\":[\"OL23765106M\",\"OL17579004M\",\"OL16501447M\",\"OL24397033M\",\"The Puppet Masters, Double Star, The Door into Summer\",\"Robert A. Heinlein\",\"Heinlein, Robert A. 1907-\",\"6824390\",\"18422145\",\"heinleintrio00hein\",\"OL28641A\",\"American Science fiction\",\"Science fiction\",\"Accessible book\",\"In library\",\"Protected DAISY\",\"A Heinlein trio\",\"/works/OL59683W\",\"Robert A. Heinlein.\",\"Robert A. Heinlein\",\"by Robert A. Heinlein.\",\"Nelson Doubleday\",\"Doubleday\",\"N. Doubleday\",\"Puppet masters.\",\"The Puppet Masters.\",\"Double Star.\",\"Double star.\",\"Door into summer.\",\"The Door into Summer.\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"author_name\":[\"Robert A. Heinlein\"],\"contributor\":[\"Heinlein, Robert A. 1907-\"],\"seed\":[\"/books/OL23765106M\",\"/books/OL17579004M\",\"/books/OL16501447M\",\"/books/OL24397033M\",\"/works/OL59683W\",\"/subjects/american_science_fiction\",\"/subjects/accessible_book\",\"/subjects/in_library\",\"/subjects/protected_daisy\",\"/subjects/science_fiction\",\"/authors/OL28641A\"],\"oclc\":[\"6824390\",\"18422145\"],\"ia\":[\"heinleintrio00hein\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"Science fiction\",\"Accessible book\",\"In library\",\"Protected DAISY\"],\"title\":\"A Heinlein trio\",\"ia_collection_s\":\"printdisabled;americana;internetarchivebooks\",\"printdisabled_s\":\"OL24397033M\",\"type\":\"work\",\"ebook_count_i\":1,\"publish_place\":[\"New York\",\"Garden City, N.Y\"],\"ia_box_id\":[\"IA1618914\",\"IA120704\"],\"edition_count\":4,\"key\":\"/works/OL59683W\",\"public_scan_b\":false,\"publisher\":[\"Nelson Doubleday\",\"Doubleday\",\"N. Doubleday\"],\"language\":[\"eng\"],\"last_modified_i\":1558249856,\"first_publish_year\":1956,\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL24397033M\",\"publish_year\":[1956,1980],\"publish_date\":[\"1956\",\"1980\"]}]}"