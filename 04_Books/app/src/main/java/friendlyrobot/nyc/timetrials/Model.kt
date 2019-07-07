package friendlyrobot.nyc.timetrials

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class SearchResponse(
    val numFound: Int,
    val docs: Array<BookDocument>
)

@JsonClass(generateAdapter = true)
data class BookDocument(
    val title_suggest: String
)

val SAMPLE_DATA = "{\"start\":0,\"num_found\":4,\"numFound\":4,\"docs\":[{\"title_suggest\":\"The man who sold the moon\",\"edition_key\":[\"OL6068477M\",\"OL6091725M\",\"OL15571576M\",\"OL19869880M\",\"OL6132080M\",\"OL13791721M\",\"OL9414227M\",\"OL13791729M\",\"OL7569653M\",\"OL7569150M\",\"OL7570621M\",\"OL7661280M\",\"OL9044962M\",\"OL8673279M\",\"OL7659973M\"],\"cover_i\":5544702,\"id_librarything\":[\"19101\"],\"has_fulltext\":true,\"text\":[\"OL6068477M\",\"OL6091725M\",\"OL15571576M\",\"OL19869880M\",\"OL6132080M\",\"OL13791721M\",\"OL9414227M\",\"OL13791729M\",\"OL7569653M\",\"OL7569150M\",\"OL7570621M\",\"OL7661280M\",\"OL9044962M\",\"OL8673279M\",\"OL7659973M\",\"0451087178\",\"9780451008473\",\"9780451087171\",\"0451043073\",\"9780450004315\",\"9780671656232\",\"0671656236\",\"9781567231557\",\"9785551393245\",\"0671578634\",\"5551393240\",\"0451008472\",\"0450004317\",\"9780451043078\",\"1567231551\",\"9780671578633\",\"Robert A. Heinlein\",\"1933095\",\"15314008\",\"1229115\",\"228294765\",\"3637445\",\"7385477\",\"manwhosoldmoon00hein\",\"OL28641A\",\"American Science fiction\",\"Accessible book\",\"In library\",\"Protected DAISY\",\"Harriman and the escape from the earth to the moon!\",\"Harriman and the escape from Earth to the Moon!\",\"The man who sold the moon\",\"/works/OL59717W\",\"Introd. by John W. Campbell, Jr.\",\"By Robert A. Heinlein ; introduction by John W. Campbell, Jr.\",\"by Robert Heinlein.\",\"Yestermorrow Inc\",\"Sidgwick& Jackson\",\"New English Library\",\"Shasta Publishers\",\"Roc\",\"New American Library\",\"Baen\",\"Baen Books\",\"Pan\",\"The Man Who Sold The Moon\",\"The Man Who Sold the Moon\",\"The man who sold the moon.\",\"The Man who Sold the Moon\",\"Man Who Sold the Moon\",\"50006570\",\"51008552\",\"53003804\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\",\"Archibald Douglas, Sc. D., Ph.D., B.S., read the telegram with unconcealed annoyance.\"],\"author_name\":[\"Robert A. Heinlein\"],\"ia_loaded_id\":[\"manwhosoldmoon00hein\"],\"seed\":[\"/books/OL6068477M\",\"/books/OL6091725M\",\"/books/OL15571576M\",\"/books/OL19869880M\",\"/books/OL6132080M\",\"/books/OL13791721M\",\"/books/OL9414227M\",\"/books/OL13791729M\",\"/books/OL7569653M\",\"/books/OL7569150M\",\"/books/OL7570621M\",\"/books/OL7661280M\",\"/books/OL9044962M\",\"/books/OL8673279M\",\"/books/OL7659973M\",\"/works/OL59717W\",\"/subjects/american_science_fiction\",\"/subjects/protected_daisy\",\"/subjects/accessible_book\",\"/subjects/in_library\",\"/authors/OL28641A\"],\"oclc\":[\"1933095\",\"15314008\",\"1229115\",\"228294765\",\"3637445\",\"7385477\"],\"ia\":[\"manwhosoldmoon00hein\"],\"isbn\":[\"0451087178\",\"9780451008473\",\"9780451087171\",\"0451043073\",\"9780450004315\",\"9780671656232\",\"0671656236\",\"9781567231557\",\"9785551393245\",\"0671578634\",\"5551393240\",\"0451008472\",\"0450004317\",\"9780451043078\",\"1567231551\",\"9780671578633\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"Accessible book\",\"In library\",\"Protected DAISY\"],\"title\":\"The man who sold the moon\",\"lending_identifier_s\":\"manwhosoldmoon00hein\",\"ia_collection_s\":\"printdisabled;inlibrary;china;internetarchivebooks\",\"printdisabled_s\":\"OL15571576M\",\"type\":\"work\",\"ebook_count_i\":1,\"publish_place\":[\"[New York]\",\"London\",\"Chicago\"],\"ia_box_id\":[\"IA118412\"],\"edition_count\":15,\"first_publish_year\":1950,\"key\":\"/works/OL59717W\",\"id_goodreads\":[\"540510\",\"2088288\",\"16688\",\"2527377\",\"1863349\",\"2527467\",\"50874\"],\"public_scan_b\":false,\"publisher\":[\"Yestermorrow Inc\",\"Sidgwick& Jackson\",\"New English Library\",\"Shasta Publishers\",\"Roc\",\"New American Library\",\"Baen\",\"Baen Books\",\"Pan\"],\"language\":[\"eng\"],\"lccn\":[\"50006570\",\"51008552\",\"53003804\"],\"last_modified_i\":1542489570,\"lending_edition_s\":\"OL15571576M\",\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL7569150M\",\"first_sentence\":[\"Archibald Douglas, Sc. D., Ph.D., B.S., read the telegram with unconcealed annoyance.\"],\"publish_year\":[1987,1979,1999,1971,1970,1955,2000,1951,1950,1953,1989],\"publish_date\":[\"July 1, 1970\",\"April 1999\",\"April 1971\",\"June 5, 1979\",\"1970\",\"1955\",\"1951\",\"1950\",\"1953\",\"March 1, 1987\",\"March 1, 2000\",\"December 1989\"]},{\"title_suggest\":\"Farnham's Freehold\",\"edition_key\":[\"OL18701757M\",\"OL5915405M\",\"OL18401165M\",\"OL24382043M\",\"OL9443254M\",\"OL17578869M\",\"OL20326905M\",\"OL21201624M\",\"OL15060715M\",\"OL7470463M\",\"OL7500829M\",\"OL7502264M\",\"OL7663207M\",\"OL22209584M\",\"OL8456949M\"],\"cover_i\":7314182,\"id_librarything\":[\"2525\"],\"has_fulltext\":true,\"text\":[\"OL18701757M\",\"OL5915405M\",\"OL18401165M\",\"OL24382043M\",\"OL9443254M\",\"OL17578869M\",\"OL20326905M\",\"OL21201624M\",\"OL15060715M\",\"OL7470463M\",\"OL7500829M\",\"OL7502264M\",\"OL7663207M\",\"OL22209584M\",\"OL8456949M\",\"9780552100670\",\"0425083799\",\"0671722069\",\"0234778946\",\"9780425035689\",\"0552100676\",\"1416520937\",\"0399102795\",\"9780234778944\",\"9781416520931\",\"9780671722067\",\"9780399102790\",\"0425035689\",\"9780425083796\",\"Robert A. Heinlein\",\"70630435\",\"3041492\",\"11069901\",\"farnhamsfreehold00hein_0\",\"farnhamsfreehold00hein\",\"OL28641A\",\"American Science fiction\",\"In library\",\"Accessible book\",\"Fiction in English\",\"Fiction\",\"Slaves\",\"Protected DAISY\",\"Nuclear warfare\",\"a novel\",\"a novel.\",\"Farnham's Freehold\",\"/works/OL15411759W\",\"Robert A. Heinlein.\",\"Robert A. Heinlein\",\"by Robert A. Heinlein.\",\"Dobson\",\"Dobson Books Ltd\",\"Putnam Pub Group (T)\",\"Berkley\",\"New American Library of Canada\",\"New American Library\",\"Corgi\",\"Baen\",\"Putnam\",\"Farnham's freehold\",\"64018007\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\",\"\\\"It's not a hearing aid,\\\" Hubert Farnham explained.\",\"Farnham\",\"Dystopian future America\",\"Dystopian future America\"],\"author_name\":[\"Robert A. Heinlein\"],\"seed\":[\"/books/OL18701757M\",\"/books/OL5915405M\",\"/books/OL18401165M\",\"/books/OL24382043M\",\"/books/OL9443254M\",\"/books/OL17578869M\",\"/books/OL20326905M\",\"/books/OL21201624M\",\"/books/OL15060715M\",\"/books/OL7470463M\",\"/books/OL7500829M\",\"/books/OL7502264M\",\"/books/OL7663207M\",\"/books/OL22209584M\",\"/books/OL8456949M\",\"/works/OL15411759W\",\"/subjects/american_science_fiction\",\"/subjects/accessible_book\",\"/subjects/protected_daisy\",\"/subjects/in_library\",\"/subjects/fiction\",\"/subjects/nuclear_warfare\",\"/subjects/fiction_in_english\",\"/subjects/slaves\",\"/subjects/person:farnham\",\"/subjects/place:dystopian_future_america\",\"/subjects/time:dystopian_future_america\",\"/authors/OL28641A\"],\"oclc\":[\"70630435\",\"3041492\",\"11069901\"],\"ia\":[\"farnhamsfreehold00hein_0\",\"farnhamsfreehold00hein\"],\"isbn\":[\"9780552100670\",\"0425083799\",\"0671722069\",\"0234778946\",\"9780425035689\",\"0552100676\",\"1416520937\",\"0399102795\",\"9780234778944\",\"9781416520931\",\"9780671722067\",\"9780399102790\",\"0425035689\",\"9780425083796\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"In library\",\"Accessible book\",\"Fiction in English\",\"Fiction\",\"Slaves\",\"Protected DAISY\",\"Nuclear warfare\"],\"title\":\"Farnham's Freehold\",\"lending_identifier_s\":\"farnhamsfreehold00hein\",\"ia_collection_s\":\"printdisabled;americana;internetarchivebooks;inlibrary;china;browserlending\",\"printdisabled_s\":\"OL22209584M;OL24382043M\",\"type\":\"work\",\"ebook_count_i\":2,\"publish_place\":[\"New York\",\"London\",\"[Toronto, Ont.]\"],\"ia_box_id\":[\"IA126201\",\"IA1127922\"],\"edition_count\":15,\"first_publish_year\":1964,\"key\":\"/works/OL15411759W\",\"id_goodreads\":[\"939670\",\"50840\",\"939671\",\"1391976\",\"939673\",\"2708399\",\"939669\"],\"public_scan_b\":false,\"publisher\":[\"Dobson\",\"Dobson Books Ltd\",\"Putnam Pub Group (T)\",\"Berkley\",\"New American Library of Canada\",\"New American Library\",\"Corgi\",\"Baen\",\"Putnam\"],\"language\":[\"eng\"],\"lccn\":[\"64018007\"],\"last_modified_i\":1498000809,\"lending_edition_s\":\"OL24382043M\",\"author_alternative_name\":[\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL22209584M\",\"first_sentence\":[\"\\\"It's not a hearing aid,\\\" Hubert Farnham explained.\"],\"person\":[\"Farnham\"],\"publish_year\":[1985,1994,1996,1977,1965,1974,1964,2006,1976],\"publish_date\":[\"October 24, 2006\",\"1996\",\"March 15, 1977\",\"1964\",\"1965\",\"1974\",\"July 1965\",\"March 15, 1985\",\"February 1, 1994\",\"1976\",\"June 1977\"],\"place\":[\"Dystopian future America\"],\"time\":[\"Dystopian future America\"]},{\"title_suggest\":\"Farmer in the Sky\",\"edition_key\":[\"OL6073813M\",\"OL21965178M\",\"OL20820773M\",\"OL15068178M\",\"OL10487438M\",\"OL7719954M\",\"OL9587083M\",\"OL16388415M\",\"OL10682977M\",\"OL9603106M\",\"OL9725837M\",\"OL17227852M\",\"OL10602345M\",\"OL11758191M\",\"OL24370477M\"],\"cover_i\":2787306,\"id_librarything\":[\"43704\"],\"has_fulltext\":true,\"text\":[\"OL6073813M\",\"OL21965178M\",\"OL20820773M\",\"OL15068178M\",\"OL10487438M\",\"OL7719954M\",\"OL9587083M\",\"OL16388415M\",\"OL10682977M\",\"OL9603106M\",\"OL9725837M\",\"OL17227852M\",\"OL10602345M\",\"OL11758191M\",\"OL24370477M\",\"0575047836\",\"0736689354\",\"9781416555407\",\"9780345243751\",\"0345275969\",\"1416555404\",\"0575004908\",\"9780345302021\",\"0330107135\",\"1439132771\",\"0345243757\",\"0345243757150\",\"0684126486\",\"0345324382\",\"9780345275967\",\"9780330107136\",\"9780575047839\",\"9781439132777\",\"9780684126487\",\"0345302028\",\"9780736689359\",\"9780575004900\",\"9780345324382\",\"Robert A. Heinlein\",\"Geary, Clifford N.\",\"Woosley, Jim\",\"Geary, Clifford N., illus.\",\"Geary, Clifford.\",\"Scott Brick (Narrator)\",\"369138918\",\"19496079\",\"21677202\",\"farmersky00hein\",\"farmerinsky00hein\",\"farmerinsky00robe_djf\",\"OL28641A\",\"American Science fiction\",\"In library\",\"Scouting (Youth activity)\",\"Accessible book\",\"Criticism and interpretation\",\"Fathers and sons\",\"Fiction\",\"Coming of age\",\"Science fiction\",\"Protected DAISY\",\"Space colonies\",\"Farm life\",\"Farmer in the Sky\",\"/works/OL59713W\",\"illustrated by Clifford Geary.\",\"by R.A. Heinlein.\",\"Robert A. Heinlein\",\"by Robert A. Heinlein\",\"Ballantine Books\",\"Atheneum\",\"Del Rey\",\"Pan Books Ltd.\",\"Books On Tape\",\"VGSF\",\"Scribner\",\"Baen Books\",\"Gollancz\",\"Farmer in the sky.\",\"Farmer in the sky\",\"68000858\",\"50014133\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\",\"Our troop had been up in the High Sierras that day and we were late getting back.\",\"Robert A. Heinlein (1907-1988)\"],\"author_name\":[\"Robert A. Heinlein\"],\"contributor\":[\"Geary, Clifford N.\",\"Woosley, Jim\",\"Geary, Clifford N., illus.\",\"Geary, Clifford.\",\"Scott Brick (Narrator)\"],\"seed\":[\"/books/OL6073813M\",\"/books/OL21965178M\",\"/books/OL20820773M\",\"/books/OL15068178M\",\"/books/OL10487438M\",\"/books/OL7719954M\",\"/books/OL9587083M\",\"/books/OL16388415M\",\"/books/OL10682977M\",\"/books/OL9603106M\",\"/books/OL9725837M\",\"/books/OL17227852M\",\"/books/OL10602345M\",\"/books/OL11758191M\",\"/books/OL24370477M\",\"/works/OL59713W\",\"/subjects/american_science_fiction\",\"/subjects/in_library\",\"/subjects/scouting_(youth_activity)\",\"/subjects/accessible_book\",\"/subjects/criticism_and_interpretation\",\"/subjects/fathers_and_sons\",\"/subjects/fiction\",\"/subjects/coming_of_age\",\"/subjects/science_fiction\",\"/subjects/protected_daisy\",\"/subjects/space_colonies\",\"/subjects/farm_life\",\"/subjects/person:robert_a._heinlein_(1907-1988)\",\"/authors/OL28641A\"],\"oclc\":[\"369138918\",\"19496079\",\"21677202\"],\"ia\":[\"farmersky00hein\",\"farmerinsky00hein\",\"farmerinsky00robe_djf\"],\"isbn\":[\"0575047836\",\"0736689354\",\"9781416555407\",\"9780345243751\",\"0345275969\",\"1416555404\",\"0575004908\",\"9780345302021\",\"0330107135\",\"1439132771\",\"0345243757\",\"0345243757150\",\"0684126486\",\"0345324382\",\"9780345275967\",\"9780330107136\",\"9780575047839\",\"9781439132777\",\"9780684126487\",\"0345302028\",\"9780736689359\",\"9780575004900\",\"9780345324382\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"In library\",\"Scouting (Youth activity)\",\"Accessible book\",\"Criticism and interpretation\",\"Fathers and sons\",\"Fiction\",\"Coming of age\",\"Science fiction\",\"Protected DAISY\",\"Space colonies\",\"Farm life\"],\"title\":\"Farmer in the Sky\",\"ia_collection_s\":\"printdisabled;americana;internetarchivebooks;librarygenesis\",\"printdisabled_s\":\"OL9603106M;OL24370477M\",\"type\":\"work\",\"ebook_count_i\":3,\"publish_place\":[\"Riverdale, NY\",\"New York\",\"London\"],\"ia_box_id\":[\"IA1104923\",\"IA122504\"],\"edition_count\":15,\"key\":\"/works/OL59713W\",\"id_goodreads\":[\"1654979\",\"786023\",\"1035497\",\"50892\",\"830993\",\"1654976\",\"50851\",\"331176\",\"1654977\"],\"public_scan_b\":true,\"publisher\":[\"Ballantine Books\",\"Atheneum\",\"Del Rey\",\"Pan Books Ltd.\",\"Books On Tape\",\"VGSF\",\"Scribner\",\"Baen Books\",\"Gollancz\"],\"language\":[\"eng\"],\"lccn\":[\"68000858\",\"50014133\"],\"last_modified_i\":1558304400,\"first_publish_year\":1950,\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL11758191M\",\"first_sentence\":[\"Our troop had been up in the High Sierras that day and we were late getting back.\"],\"person\":[\"Robert A. Heinlein (1907-1988)\"],\"publish_year\":[1990,1985,1969,1978,1975,1981,1973,1962,2001,1950,2008],\"publish_date\":[\"1990\",\"March 12, 1978\",\"1969\",\"1962\",\"February 12, 1985\",\"1975\",\"1973\",\"March 12, 1975\",\"May 6, 2008\",\"1950\",\"June 1973\",\"2008\",\"September 12, 1981\",\"December 2001\"]},{\"title_suggest\":\"Starman Jones\",\"edition_key\":[\"OL6137996M\",\"OL22007168M\",\"OL17256138M\",\"OL19210219M\",\"OL7859813M\",\"OL10682206M\",\"OL17855679M\",\"OL21445321M\",\"OL10682976M\",\"OL9608268M\",\"OL7569246M\",\"OL10685091M\",\"OL8673281M\",\"OL23118871M\",\"OL3433973M\"],\"cover_i\":8291268,\"id_librarything\":[\"85592\",\"1184486\"],\"has_fulltext\":true,\"text\":[\"OL6137996M\",\"OL22007168M\",\"OL17256138M\",\"OL19210219M\",\"OL7859813M\",\"OL10682206M\",\"OL17855679M\",\"OL21445321M\",\"OL10682976M\",\"OL9608268M\",\"OL7569246M\",\"OL10685091M\",\"OL8673281M\",\"OL23118871M\",\"OL3433973M\",\"1416505504\",\"9780450030406\",\"0345243544\",\"9780345301048\",\"0345345096\",\"9781567231571\",\"9780575006218\",\"9780345345097\",\"9781416505501\",\"0345275950\",\"9780345243546\",\"0450030407\",\"0345301048\",\"9780345275950\",\"0575006218\",\"1567231578\",\"Robert A. Heinlein\",\"Geary, Clifford N.\",\"Geary, Clifford N., illus.\",\"David Smee dustwrapper (Illustrator)\",\"233936130\",\"58990220\",\"starmanjones00robe_cqg\",\"starmanjones0000hein\",\"OL28641A\",\"American Science fiction\",\"In library\",\"Accessible book\",\"Interplanetary voyages\",\"Fiction\",\"Science fiction\",\"Children's stories\",\"Protected DAISY\",\"Time travel\",\"Starman Jones\",\"/works/OL59718W\",\"Robert A. Heinlein.\",\"illustrated by Clifford Geary.\",\"by Robert A. Heinlein ; illustrated by Clifford Geary.\",\"Robert A. Heinlein\",\"Yestermorrow Inc\",\"Ballantine Books\",\"New English Library\",\"Dell\",\"Pocket\",\"Del Rey\",\"Pocket Books\",\"Ballantine Books, 1978, c1953\",\"Scribner\",\"Sidgwick and Jackson\",\"Gollancz\",\"68001284\",\"53012457\",\"2005273992\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\",\"Max liked this time of day, this time of year.\"],\"author_name\":[\"Robert A. Heinlein\"],\"contributor\":[\"Geary, Clifford N.\",\"Geary, Clifford N., illus.\",\"David Smee dustwrapper (Illustrator)\"],\"seed\":[\"/books/OL6137996M\",\"/books/OL22007168M\",\"/books/OL17256138M\",\"/books/OL19210219M\",\"/books/OL7859813M\",\"/books/OL10682206M\",\"/books/OL17855679M\",\"/books/OL21445321M\",\"/books/OL10682976M\",\"/books/OL9608268M\",\"/books/OL7569246M\",\"/books/OL10685091M\",\"/books/OL8673281M\",\"/books/OL23118871M\",\"/books/OL3433973M\",\"/works/OL59718W\",\"/subjects/science_fiction\",\"/subjects/in_library\",\"/subjects/children's_stories\",\"/subjects/american_science_fiction\",\"/subjects/interplanetary_voyages\",\"/subjects/time_travel\",\"/subjects/fiction\",\"/authors/OL28641A\"],\"oclc\":[\"233936130\",\"58990220\"],\"ia\":[\"starmanjones00robe_cqg\",\"starmanjones0000hein\"],\"isbn\":[\"1416505504\",\"9780450030406\",\"0345243544\",\"9780345301048\",\"0345345096\",\"9781567231571\",\"9780575006218\",\"9780345345097\",\"9781416505501\",\"0345275950\",\"9780345243546\",\"0450030407\",\"0345301048\",\"9780345275950\",\"0575006218\",\"1567231578\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"In library\",\"Accessible book\",\"Interplanetary voyages\",\"Fiction\",\"Science fiction\",\"Children's stories\",\"Protected DAISY\",\"Time travel\"],\"title\":\"Starman Jones\",\"ia_collection_s\":\"printdisabled;china;americana;internetarchivebooks\",\"printdisabled_s\":\"OL10682206M;OL9608268M\",\"type\":\"work\",\"ebook_count_i\":2,\"publish_place\":[\"S.l\",\"New York\",\"London\"],\"ia_box_id\":[\"IA1418617\",\"IA1104923\"],\"edition_count\":15,\"key\":\"/works/OL59718W\",\"id_goodreads\":[\"2527412\",\"351\",\"776331\",\"776332\",\"1989933\",\"1477233\",\"50895\",\"50878\"],\"public_scan_b\":false,\"publisher\":[\"Yestermorrow Inc\",\"Ballantine Books\",\"New English Library\",\"Dell\",\"Pocket\",\"Del Rey\",\"Pocket Books\",\"Ballantine Books, 1978, c1953\",\"Scribner\",\"Sidgwick and Jackson\",\"Gollancz\"],\"language\":[\"eng\"],\"lccn\":[\"68001284\",\"53012457\",\"2005273992\"],\"last_modified_i\":1558249005,\"first_publish_year\":1953,\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL10682206M\",\"first_sentence\":[\"Max liked this time of day, this time of year.\"],\"publish_year\":[1986,1985,1978,1999,1976,1975,1967,1981,1971,1954,1953,2005],\"publish_date\":[\"1985\",\"2005\",\"1976\",\"1975\",\"1967\",\"1971\",\"1954\",\"January 12, 1978\",\"1953\",\"October 12, 1986\",\"January 12, 1975\",\"January 1999\",\"September 12, 1981\"]}]}"

val SAMPLE_DATA2 = "{\"start\":0,\"num_found\":4,\"numFound\":4,\"docs\":[{\"title_suggest\":\"Double Star\",\"edition_key\":[\"OL6197671M\",\"OL22211481M\",\"OL19177780M\",\"OL21199614M\",\"OL20495773M\",\"OL15080460M\",\"OL15266661M\",\"OL7569805M\",\"OL10269181M\",\"OL4718754M\",\"OL9414751M\",\"OL8105879M\",\"OL8109454M\",\"OL9504248M\",\"OL8109258M\"],\"cover_i\":5540970,\"id_librarything\":[\"7502\"],\"has_fulltext\":true,\"text\":[\"OL6197671M\",\"OL22211481M\",\"OL19177780M\",\"OL21199614M\",\"OL20495773M\",\"OL15080460M\",\"OL15266661M\",\"OL7569805M\",\"OL10269181M\",\"OL4718754M\",\"OL9414751M\",\"OL8105879M\",\"OL8109454M\",\"OL9504248M\",\"OL8109258M\",\"9780786117765\",\"0345330137\",\"0786117451\",\"0451036697\",\"0786117761\",\"9780345330130\",\"9780786117451\",\"0786199024\",\"0451024192\",\"9780451024190\",\"0586025022\",\"0839824467\",\"9780839824466\",\"9780786195039\",\"9780786199020\",\"9780586025024\",\"0451126955\",\"9780451126955\",\"0786195037\",\"9780451036698\",\"Robert A. Heinlein\",\"Lloyd James (Narrator)\",\"3228783\",\"676595\",\"7125635\",\"doublestar0000hein\",\"doublestar00hein_952\",\"doublestar00hein\",\"OL28641A\",\"American Science fiction\",\"In library\",\"Accessible book\",\"Hugo Award Winner\",\"award:hugo_award=novel\",\"Protected DAISY\",\"award:hugo_award=1956\",\"Library Edition\",\"Double Star\",\"/works/OL59715W\",\"Robert A. Heinlein ; with a new introd. by Joe Haldeman.\",\"by Robert A. Heinlein.\",\"Gregg Press\",\"Del Rey\",\"Blackstone Audiobooks\",\"Roc\",\"Reef Audio\",\"New American Library of Canada\",\"Science Fiction Book Club\",\"Joseph\",\"Signet\",\"Grafton Books\",\"New American Library\",\"Del Ray\",\"Doubleday\",\"Double star.\",\"Double star\",\"78005569\",\"56005961\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\",\"IF A MAN WALKS IN DRESSED LIKE A HICK AND acting as if he owned the place, he's a spaceman.\"],\"author_name\":[\"Robert A. Heinlein\"],\"contributor\":[\"Lloyd James (Narrator)\"],\"seed\":[\"/books/OL6197671M\",\"/books/OL22211481M\",\"/books/OL19177780M\",\"/books/OL21199614M\",\"/books/OL20495773M\",\"/books/OL15080460M\",\"/books/OL15266661M\",\"/books/OL7569805M\",\"/books/OL10269181M\",\"/books/OL4718754M\",\"/books/OL9414751M\",\"/books/OL8105879M\",\"/books/OL8109454M\",\"/books/OL9504248M\",\"/books/OL8109258M\",\"/works/OL59715W\",\"/subjects/hugo_award_winner\",\"/subjects/award:hugo_award=1956\",\"/subjects/award:hugo_award=novel\",\"/subjects/accessible_book\",\"/subjects/protected_daisy\",\"/subjects/in_library\",\"/subjects/american_science_fiction\",\"/authors/OL28641A\"],\"oclc\":[\"3228783\",\"676595\",\"7125635\"],\"ia\":[\"doublestar0000hein\",\"doublestar00hein_952\",\"doublestar00hein\"],\"isbn\":[\"9780786117765\",\"0345330137\",\"0786117451\",\"0451036697\",\"0786117761\",\"9780345330130\",\"9780786117451\",\"0786199024\",\"0451024192\",\"9780451024190\",\"0586025022\",\"0839824467\",\"9780839824466\",\"9780786195039\",\"9780786199020\",\"9780586025024\",\"0451126955\",\"9780451126955\",\"0786195037\",\"9780451036698\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"In library\",\"Accessible book\",\"Hugo Award Winner\",\"award:hugo_award=novel\",\"Protected DAISY\",\"award:hugo_award=1956\"],\"title\":\"Double Star\",\"lending_identifier_s\":\"doublestar0000hein\",\"ia_collection_s\":\"printdisabled;americana;internetarchivebooks;delawarecountydistrictlibrary;inlibrary;trent_university;librarygenesis\",\"printdisabled_s\":\"OL9414751M;OL4718754M;OL22211481M\",\"type\":\"work\",\"ebook_count_i\":3,\"publish_place\":[\"London\",\"Boston\",\"New York, NY\",\"Garden City, N.Y\",\"Toronto, ON\"],\"ia_box_id\":[\"IA122304\",\"IA1240002\"],\"edition_count\":15,\"first_publish_year\":1956,\"key\":\"/works/OL59715W\",\"id_goodreads\":[\"1654971\",\"4392987\",\"271436\",\"1654970\",\"540500\",\"175324\",\"50846\",\"5899411\",\"1090854\",\"2527364\"],\"public_scan_b\":false,\"publisher\":[\"Gregg Press\",\"Del Rey\",\"Blackstone Audiobooks\",\"Roc\",\"Reef Audio\",\"New American Library of Canada\",\"Science Fiction Book Club\",\"Joseph\",\"Signet\",\"Grafton Books\",\"New American Library\",\"Del Ray\",\"Doubleday\"],\"language\":[\"eng\"],\"lccn\":[\"78005569\",\"56005961\"],\"last_modified_i\":1559374803,\"lending_edition_s\":\"OL4718754M\",\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL15266661M\",\"first_sentence\":[\"IF A MAN WALKS IN DRESSED LIKE A HICK AND acting as if he owned the place, he's a spaceman.\"],\"publish_year\":[1986,1968,1956,1978,1964,1960,1957,2000,2001,1959,1958],\"publish_date\":[\"March 2000\",\"September 2001\",\"January 1964\",\"1978\",\"1960\",\"October 1, 1968\",\"1957\",\"1956\",\"April 2000\",\"October 12, 1986\",\"1959\",\"1958\"]},{\"title_suggest\":\"Time for the Stars\",\"edition_key\":[\"OL6200248M\",\"OL15050738M\",\"OL18233198M\",\"OL13834613M\",\"OL22787471M\",\"OL9629504M\",\"OL9608374M\",\"OL9680419M\",\"OL15069057M\",\"OL9705871M\",\"OL7720675M\",\"OL16450922M\",\"OL8053619M\",\"OL8053620M\"],\"cover_i\":524700,\"id_librarything\":[\"17586\"],\"has_fulltext\":true,\"text\":[\"OL6200248M\",\"OL15050738M\",\"OL18233198M\",\"OL13834613M\",\"OL22787471M\",\"OL9629504M\",\"OL9608374M\",\"OL9680419M\",\"OL15069057M\",\"OL9705871M\",\"OL7720675M\",\"OL16450922M\",\"OL8053619M\",\"OL8053620M\",\"9780765314932\",\"9780345351913\",\"0575036974\",\"9780684192116\",\"0345293894\",\"9780345323859\",\"9780765314949\",\"0345301862\",\"0765314940\",\"9780575036970\",\"068419211X\",\"9780345301864\",\"057500679X\",\"0765314932\",\"0345323858\",\"0345351916\",\"9780575049369\",\"9780345293893\",\"0575049367\",\"9780575006799\",\"Robert A. Heinlein\",\"85782631\",\"14867042\",\"233549189\",\"22889971\",\"471252414\",\"timeforstars00hein\",\"timeforstars00robe_1xf\",\"OL28641A\",\"In library\",\"Accessible book\",\"robert heinlein\",\"rah\",\"Science fiction\",\"Protected DAISY\",\"Time for the Stars\",\"/works/OL59711W\",\"by Robert A.Heinlein.\",\"by Robert A. Heinlein.\",\"Atheneum\",\"Tor Books\",\"Del Rey\",\"Scribner's\",\"Orb Books\",\"VGSF\",\"Scribner\",\"Gollancz\",\"Pan\",\"Time for the stars.\",\"Time for the stars\",\"56009286\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\",\"According to their biographies, Destiny's favored children usually had their lives planned out from scratch.\",\"Future\"],\"author_name\":[\"Robert A. Heinlein\"],\"seed\":[\"/books/OL6200248M\",\"/books/OL15050738M\",\"/books/OL18233198M\",\"/books/OL13834613M\",\"/books/OL22787471M\",\"/books/OL9629504M\",\"/books/OL9608374M\",\"/books/OL9680419M\",\"/books/OL15069057M\",\"/books/OL9705871M\",\"/books/OL7720675M\",\"/books/OL16450922M\",\"/books/OL8053619M\",\"/books/OL8053620M\",\"/works/OL59711W\",\"/subjects/science_fiction\",\"/subjects/in_library\",\"/subjects/rah\",\"/subjects/robert_heinlein\",\"/subjects/time:future\",\"/authors/OL28641A\"],\"oclc\":[\"85782631\",\"14867042\",\"233549189\",\"22889971\",\"471252414\"],\"ia\":[\"timeforstars00hein\",\"timeforstars00robe_1xf\"],\"isbn\":[\"9780765314932\",\"9780345351913\",\"0575036974\",\"9780684192116\",\"0345293894\",\"9780345323859\",\"9780765314949\",\"0345301862\",\"0765314940\",\"9780575036970\",\"068419211X\",\"9780345301864\",\"057500679X\",\"0765314932\",\"0345323858\",\"0345351916\",\"9780575049369\",\"9780345293893\",\"0575049367\",\"9780575006799\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"In library\",\"Accessible book\",\"robert heinlein\",\"rah\",\"Science fiction\",\"Protected DAISY\"],\"title\":\"Time for the Stars\",\"lending_identifier_s\":\"timeforstars00robe_1xf\",\"ia_collection_s\":\"printdisabled;librarygenesis;americana;internetarchivebooks;delawarecountydistrictlibrary;browserlending;inlibrary\",\"printdisabled_s\":\"OL9608374M;OL9705871M\",\"type\":\"work\",\"ebook_count_i\":2,\"publish_place\":[\"New York\",\"London\"],\"ia_box_id\":[\"IA1104912\"],\"edition_count\":14,\"first_publish_year\":1956,\"key\":\"/works/OL59711W\",\"id_goodreads\":[\"50876\",\"939675\",\"46549\",\"50865\",\"939676\",\"540507\",\"939678\",\"939674\",\"356\"],\"public_scan_b\":false,\"publisher\":[\"Atheneum\",\"Tor Books\",\"Del Rey\",\"Scribner's\",\"Orb Books\",\"VGSF\",\"Scribner\",\"Gollancz\",\"Pan\"],\"language\":[\"eng\"],\"lccn\":[\"56009286\"],\"last_modified_i\":1514704601,\"lending_edition_s\":\"OL9608374M\",\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL8053619M\",\"first_sentence\":[\"According to their biographies, Destiny's favored children usually had their lives planned out from scratch.\"],\"publish_year\":[1991,1987,1984,1985,1968,1980,1981,1970,1956,2006,2007,1990,1963],\"publish_date\":[\"1991\",\"1985\",\"1968\",\"1963\",\"March 6, 2007\",\"1970\",\"November 12, 1984\",\"July 12, 1987\",\"1956\",\"August 8, 2006\",\"September 12, 1981\",\"July 12, 1980\",\"October 1990\"],\"time\":[\"Future\"]},{\"title_suggest\":\"Space Cadet\",\"edition_key\":[\"OL6029080M\",\"OL22806588M\",\"OL24274707M\",\"OL23248300M\",\"OL15068114M\",\"OL21322072M\",\"OL10682716M\",\"OL10684014M\",\"OL10684836M\",\"OL7569335M\",\"OL9410648M\",\"OL3684265M\",\"OL3422395M\"],\"cover_i\":524676,\"id_librarything\":[\"17542\"],\"has_fulltext\":true,\"text\":[\"OL6029080M\",\"OL22806588M\",\"OL24274707M\",\"OL23248300M\",\"OL15068114M\",\"OL21322072M\",\"OL10682716M\",\"OL10684014M\",\"OL10684836M\",\"OL7569335M\",\"OL9410648M\",\"OL3684265M\",\"OL3422395M\",\"9780345333971\",\"0345353110\",\"0450049876\",\"0765314509\",\"9780345260727\",\"9780765314505\",\"9780450049873\",\"9780345306319\",\"9780786254842\",\"057500360X\",\"0345260724\",\"0345333977\",\"0345306317\",\"078625484X\",\"9780575003606\",\"9780345353115\",\"Robert A. Heinlein\",\"Geary, Clifford N.\",\"Geary, Clifford N ill.\",\"Geary, Clifford N., illus.\",\"12589214\",\"4474396\",\"25172757\",\"60311936\",\"78212419\",\"51944404\",\"spacecadet00hein\",\"spacecadet00hein_935\",\"spacecadet00hein_564\",\"OL28641A\",\"American Science fiction\",\"In library\",\"Space warfare\",\"Juvenile fiction\",\"Fiction\",\"Science fiction\",\"Protected DAISY\",\"Accessible book\",\"Space Cadet\",\"/works/OL59710W\",\"Robert A. Heinlein.\",\"illus. by Clifford N. Geary.\",\"by Robert A. Heinlein.\",\"Thorndike Press\",\"Ace\",\"Ballantine\",\"Del Rey\",\"New English Library\",\"Scribner\",\"Gollancz\",\"Tor\",\"Space cadet\",\"2005043993\",\"68002155\",\"2003045272\",\"48004723\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"author_name\":[\"Robert A. Heinlein\"],\"contributor\":[\"Geary, Clifford N.\",\"Geary, Clifford N ill.\",\"Geary, Clifford N., illus.\"],\"seed\":[\"/books/OL6029080M\",\"/books/OL22806588M\",\"/books/OL24274707M\",\"/books/OL23248300M\",\"/books/OL15068114M\",\"/books/OL21322072M\",\"/books/OL10682716M\",\"/books/OL10684014M\",\"/books/OL10684836M\",\"/books/OL7569335M\",\"/books/OL9410648M\",\"/books/OL3684265M\",\"/books/OL3422395M\",\"/works/OL59710W\",\"/subjects/science_fiction\",\"/subjects/juvenile_fiction\",\"/subjects/accessible_book\",\"/subjects/protected_daisy\",\"/subjects/in_library\",\"/subjects/american_science_fiction\",\"/subjects/space_warfare\",\"/subjects/fiction\",\"/authors/OL28641A\"],\"oclc\":[\"12589214\",\"4474396\",\"25172757\",\"60311936\",\"78212419\",\"51944404\"],\"ia\":[\"spacecadet00hein\",\"spacecadet00hein_935\",\"spacecadet00hein_564\"],\"isbn\":[\"9780345333971\",\"0345353110\",\"0450049876\",\"0765314509\",\"9780345260727\",\"9780765314505\",\"9780450049873\",\"9780345306319\",\"9780786254842\",\"057500360X\",\"0345260724\",\"0345333977\",\"0345306317\",\"078625484X\",\"9780575003606\",\"9780345353115\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"In library\",\"Space warfare\",\"Juvenile fiction\",\"Fiction\",\"Science fiction\",\"Protected DAISY\",\"Accessible book\"],\"title\":\"Space Cadet\",\"ia_collection_s\":\"printdisabled;americana;internetarchivebooks;librarygenesis\",\"printdisabled_s\":\"OL10682716M;OL10684836M;OL24274707M\",\"type\":\"work\",\"ebook_count_i\":3,\"publish_place\":[\"New York\",\"London\",\"Waterville, ME\"],\"ia_box_id\":[\"IA119801\"],\"edition_count\":13,\"key\":\"/works/OL59710W\",\"id_goodreads\":[\"415514\",\"2527410\",\"2527411\",\"1543042\",\"1836664\",\"1992198\",\"50852\",\"2606501\"],\"public_scan_b\":false,\"publisher\":[\"Thorndike Press\",\"Ace\",\"Ballantine\",\"Del Rey\",\"New English Library\",\"Scribner\",\"Gollancz\",\"Tor\"],\"language\":[\"eng\"],\"lccn\":[\"2005043993\",\"68002155\",\"2003045272\",\"48004723\"],\"last_modified_i\":1562489392,\"first_publish_year\":1948,\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL3422395M\",\"publish_year\":[1986,1987,1948,1985,1982,1978,1966,2003,2005],\"publish_date\":[\"1986\",\"1948\",\"1978\",\"1966\",\"February 12, 1982\",\"2003\",\"August 12, 1978\",\"2005\",\"October 12, 1987\",\"October 12, 1985\"]},{\"title_suggest\":\"Waldo and Magic, Inc\",\"edition_key\":[\"OL6067914M\",\"OL15571568M\",\"OL23022653M\",\"OL7655575M\",\"OL5323608M\",\"OL23013874M\",\"OL24223207M\",\"OL4409387M\",\"OL22004855M\",\"OL9846991M\",\"OL7569432M\"],\"cover_i\":5544491,\"id_librarything\":[\"90312\"],\"has_fulltext\":true,\"text\":[\"OL6067914M\",\"OL15571568M\",\"OL23022653M\",\"OL7655575M\",\"OL5323608M\",\"OL23013874M\",\"OL24223207M\",\"OL4409387M\",\"OL22004855M\",\"OL9846991M\",\"OL7569432M\",\"0451089383\",\"9780330023528\",\"9780450397301\",\"9780839825074\",\"9780451089380\",\"0511017588\",\"0345330153\",\"9780345330154\",\"0330023527\",\"0839825072\",\"9780511017582\",\"0450397300\",\"Robert A. Heinlein\",\"Heinlein, Robert A. 1907-\",\"Jack Gaughan (Illustrator)\",\"223641238\",\"4933021\",\"8521994\",\"2040258\",\"3407927\",\"286494\",\"15498844\",\"1192230\",\"17828156\",\"waldomagicinc00hein\",\"OL28641A\",\"American Science fiction\",\"Accessible book\",\"In library\",\"Protected DAISY\",\"Waldo and Magic, Inc\",\"/works/OL59709W\",\"by Heinlein.\",\"Robert A. Heinlein ; with a new introd. by Charles N. Brown.\",\"by Robert A. Heinlein\",\"Robert A. Heinlein.\",\"by Robert Heinlein.\",\"by Robert A. Heinlein.\",\"Pan Books\",\"Hodder & Stoughton General Division\",\"Ballantine Books\",\"Gregg Press\",\"Doubleday\",\"Pyramid Books\",\"New American Library\",\"Signet\",\"Waldo.\",\"Magic, inc\",\"Waldo\",\"Magic, Inc.\",\"Waldo & Magic, Inc.\",\"Waldo and Magic, Inc.\",\"Magic, inc.\",\"Waldo ; And, Magic, Inc.\",\"Waldo and Magic, inc.\",\"Waldo, and Magic, inc.\",\"50005838\",\"79012729\",\"72176301\",\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"author_name\":[\"Robert A. Heinlein\"],\"contributor\":[\"Heinlein, Robert A. 1907-\",\"Jack Gaughan (Illustrator)\"],\"seed\":[\"/books/OL6067914M\",\"/books/OL15571568M\",\"/books/OL23022653M\",\"/books/OL7655575M\",\"/books/OL5323608M\",\"/books/OL23013874M\",\"/books/OL24223207M\",\"/books/OL4409387M\",\"/books/OL22004855M\",\"/books/OL9846991M\",\"/books/OL7569432M\",\"/works/OL59709W\",\"/subjects/american_science_fiction\",\"/subjects/accessible_book\",\"/subjects/protected_daisy\",\"/subjects/in_library\",\"/authors/OL28641A\"],\"oclc\":[\"223641238\",\"4933021\",\"8521994\",\"2040258\",\"3407927\",\"286494\",\"15498844\",\"1192230\",\"17828156\"],\"ia\":[\"waldomagicinc00hein\"],\"isbn\":[\"0451089383\",\"9780330023528\",\"9780450397301\",\"9780839825074\",\"9780451089380\",\"0511017588\",\"0345330153\",\"9780345330154\",\"0330023527\",\"0839825072\",\"9780511017582\",\"0450397300\"],\"author_key\":[\"OL28641A\"],\"subject\":[\"American Science fiction\",\"Accessible book\",\"In library\",\"Protected DAISY\"],\"title\":\"Waldo and Magic, Inc\",\"ia_collection_s\":\"printdisabled;americana;internetarchivebooks\",\"printdisabled_s\":\"OL24223207M\",\"type\":\"work\",\"ebook_count_i\":1,\"publish_place\":[\"[New York]\",\"Boston\",\"London\",\"New Castle, VA\",\"New York, NY\",\"New York, N.Y\",\"Garden City, NY\",\"New York\"],\"ia_box_id\":[\"IA110311\"],\"edition_count\":11,\"key\":\"/works/OL59709W\",\"id_goodreads\":[\"2327224\",\"958852\",\"1035507\",\"1051102\",\"1861979\",\"121586\"],\"public_scan_b\":false,\"publisher\":[\"Pan Books\",\"Hodder & Stoughton General Division\",\"Ballantine Books\",\"Gregg Press\",\"Doubleday\",\"Pyramid Books\",\"New American Library\",\"Signet\"],\"language\":[\"eng\"],\"lccn\":[\"50005838\",\"79012729\",\"72176301\"],\"last_modified_i\":1554571191,\"first_publish_year\":1950,\"author_alternative_name\":[\"Hai Lai En (Heinlein, Robert A.(Robert Anson), 1907-1988)\",\"Heinlein                     Ra\",\"Robert Anson Heinlein\",\"Robert A Heinlein\",\"Robert Heinlein\",\"RobertA Heinlein\",\"Robert A.Heinlein\",\"ROBERT A. HEINLEIN\",\"ROBERT HEINLEIN\",\"Heinlein\",\"R.A. Heinlein\"],\"cover_edition_key\":\"OL5323608M\",\"publish_year\":[1986,1968,1969,1979,1970,1950,1963],\"publish_date\":[\"1986\",\"1968\",\"1969\",\"1979\",\"May 1963\",\"1970\",\"1950\",\"December 1, 1986\",\"October 1986\"]}]}"