package com.salimafillah.bestquotes;

import java.util.Random;

/**
 * Created by Dede Iskandar on 28/12/2014.
 */
public class Quotes {
    // Member variable (properties about the object)
    public String[] mQuotes = {
            "“Segala luka & kecewa tampaknya kan malu & meniada: ketika kita insyafi bahwa Allah Yang Maha Mengatur tak pernah keliru, tak pernah aniaya”",
            "“Masih banyak orang shalih. Tetapi tak banyak antara mereka yang memperjuangkan keshalihan”",
            "“Ada banyak hal tampak yang bisa kita tertawakan. Tapi sungguh lebih berbilang hal tak kasat yang selayaknya kita tangisi.”",
            "“Jawaban teragung pada caci maki dan kebusukan: “Bahkan walau ingin membalas, aku tak kuasa. Sebab aku tak punya kata-kata keji dan nista.”",
            "“Jawaban terbaik pada penghina dan pencela kehormatan: “Yang kaukatakan tadi sebenarnya adalah pujian; sebab aslinya diriku lebih mengerikan.”",
            "“Bahwa jika bahagia dijadikan tema utama kehidupan, kita bisa kehilangan ia setelah kematian.”",
            "“Seandainya hati kita bersih berkesucian, takkan pernah ia kenyang dan bosan kepada Al-Quran.”",
            "“Mencintai tak b'arti harus memiliki. Mencintai b'arti pengorbanan u/ kbahagiaan org yg qt cintai. Cinta tak pernah meminta u/ menanti. Ia mengambil kesempatan. Itulah kberanian. Atau mempersilakan. Yg ini pengorbanan.”",
            "“Rizqi kita sudah tertulis di Lauhul Mahfuzh. Mau diambil dari jalan halal ataupun haram, dapatnya segitu juga. Yang beda rasa berkahnya.”",
            "“Ngalah mungkin bukan berasal dari kata kalah, melainkan Allah. Dibentuk jadi ng-Allah. Artinya: bersandar & menyerahkan urusan pada Allah;)”",
            "“Berdoa bukanlah cara memberitahu Allah akan apa yang kita perlukan. -Dia Maha Tahu-. Doa adalah menghabiskan waktu penuh makna bersamaNya.”",
            "“Sungguh beda antara yakin dan naif. Yakin adalah semangat hati yang membersamai kebenaran. Naif adalah hawa nafsu yang dicarikan pembenaran.”",
            "“Sederhana itu memperindah semua. Yang miskin jadi kaya. Yang kaya jadi mulia. Yang jelata dipercaya. Yang berkuasa, dicinta”",
            "“Jika kita merasa bahwa semua orang punya masalah dengan kita, tidakkah kita curiga bahwa diri kita inilah masalahnya?”",
            "“Berbahagialah orang yang berhasil menyembunyikan ibadahnya dari manusia, tetapi mampu menampakkan bekasnya berupa akhlaq mulia pada sesama.”",
            "“Orang baik tak perlu banyak menceritakan diri. Sebab yang mencinta tak memerlukannya. Sebab yang membenci takkan percaya. Cukup Allah saja :)”",
            "“Jadi kupu-kupu; menarikan kecantikan tapi usianya pendek. Atau kura-kura; umur panjang sebab sembunyi dalam cangkang. Kadang harus memilih ;)”",
            "“Tiada orang baik yang tak punya masa lalu. Tak ada orang jahat yang tak punya masa depan. Saling menghargailah kita. Setelah itu, istiqamah.”",
            "“Dendam itu racun yang kita tenggak sendiri, lalu kita berharap orang lain yang mati. Memaafkan adalah penawarnya ;)”",
            "“Tak ada harta yang bisa kita bawa saat mati. Maka benar bahwa kekayaan tak terletak pada apa yang kita punya, melainkan apa yang kita bagi.”",
            "“Dunia itu kendaraan. Jika kau yang mengendarainya, ia mengantarmu sampai tujuan. Jika ia yang mengendaraimu, hancur badan dan kehormatan.”",
            "“Cantik (fisik) itu relatif. Tapi jelek (akhlaq) itu absolut. ;P ”",
            "“Pandai, tampan, shalih itu mempesona. Tapi mengunjuk-unjukkan pada sesama bahwa kita pintar; kita rupawan; atau kita bajik pasti memuakkan.”",
            "“Jangan mengalir meniti hidup, sebab aliran selalu menuju tempat rendah. Bersayaplah, mendakilah, meloncatlah. Meninggilah walau menyesakkan! ”",
            "“Kita berburuk sangka pada saudara, sebab kita merasa bahwa andai berada dalam kedudukannya, diri ini juga akan berbuat jelek. Jadilah baik;)”",
            "“Banyak hal yang tak kita minta, tapi Allah tak pernah alpa memberikannya. Maka pada apa yang kita mohon, bersiaplah mendapat lebih dariNya.”",
            "“Allah selalu menjawab doa kita. Tapi kadang jawabnya ialah: Tidak hambaKu. Aku punya anugerah yg lebih baik untukmu dari yg kau minta itu.”",
            "“Jika satu perintah Allah terasa berat bagi kita, cara membuatnya jadi ringan adalah dengan melaksanakannya. Selamat berkarya!:)”",
            "“Tiap penghalang di jalan kehidupan tertakdir ada untuk satu alasan sederhana: Mengetahui sebesar apa tekad kita untuk melampauinya”",
            "“Jika kau merasa bahwa segala di sekitarmu gelap, tidakkah kau curiga bahwa dirimulah yang dikirim Allah untuk jadi cahaya bagi mereka?”",
            "“Sabar adalah bentuk kesyukuran menghadapi nikmat yang bernama musibah. Syukur adalah bentuk kesabaran menghadapi musibah yang bernama nikmat”",
            "“Orang yang paling tidak menarik bagi sesama adalah dia yang memikirkan dirinya sendiri. Di situlah dimulainya segala penderitaan”",
            "“Yang disebut NIKMAT, adalah yang bisa dinikmati. Yang disebut RIZQI adalah yang mengalir masuk-keluar. Bukan yang terkumpul dalam simpanan.”",
            "“Barakah itu bukan soal APA yang diberikan Allah. Melainkan soal BAGAIMANA Dia mengulurkannya. Dengan senyum ridha ataukah dilempar murka?”",
            "“Berani hidup tak takut mati. Takut mati, jangan hidup. Takut hidup, mati saja. Selamat berjuang!:)”",
            "“Rabbi, Kau uji aku dengan nikmat lalu aku bisa bersyukur, lebih aku sukai daripada Kau uji aku dengan musibah lalu aku harus bersabar”",
            "“Melihat spion itu perlu. Tapi sesekali saja. Merenungi masa lalu itu niscaya. Tapi jangan sampai ia membelenggu kita”",
            "“Sebab aib kita tak tertanda secara zhahir di wajah, sesama masih berbaiksangka. Mari mensyukuri itu dengan berjuang menjadi orang baik”",
            "“Jika peluang maksiat yang gagal diambil masih kita sedihkan, itu penanda ada bagian hati yang harus dirawat inap;)”",
            "“Kekhawatiran tidak menjadikan bahayanya membesar. Hanya diri kita yang mengerdil. Tenanglah bersama Allah;)”",
            "“Selama di dunia, Allah tugaskan kita sebagai saksi dan da’i. Dengan itu kita menyiapkan diri agar di akhirat menjadi terdakwa yang baik.”",
            "“Dia memberitahu, bahwa kitapun tak bersih dari dosa. Bahkan ia bisa mulia dengan taubatnya, sedang kita terdosa dengan mencemoohnya”",
            "“Layang-layang justru bisa terbang saat melawan angin. Jangan gentar saat memang harus menentang. Tapi pastikan ada benang terhubung padaNya.”",
            "“Jika tak mampu bersaing dengan para shalihin dalam ibadahnya, berlombalah dengan para pendosa dalam istighfarnya”",
            "“Merasa lebih baik daripada sesama hanyalah tanda bahwa kita bahkan belum mengenal diri sendiri & kekurangan tekad untuk berbenah.”",
            "“Dua hal yang kusesali dalam hidup ini; siang yang panas tanpa kesejukan puasa, dan malam yang dingin tanpa kehangatan tahajjud.”",
            "“Mendoakan sesama adalah cara yang santun dalam meminta hal baik untuk diri sendiri. Sebab di langit ia berjawab, -Dan bagimu pun demikian”",
            "“Ukhuwah itu bukan pada indahnya pertemuan. Tetapi, ingatan seseorang terhadap saudaranya di dalam doanya.”",
            "“Agama diperdebatkan menyesakkan jiwa, dan jika agama dikerjakan menentramkan hati.”",
            "“Apa yang tangan kita tak terlibat di dalamnya; jangan sampai lisan kita berdosa karenanya.”",
            "“Persungguhlah doa; makin banyak mengetuk, kian mungkin dibuka pintunya.”",
            "“Tak semua yang jatuh berarti akhir segalanya. Jatuhnya hujan justrulah awal nan jelita.”",
            "“Setetes embun tahu dia kan dimusnahkan hangat mentari; tapi ia tetap memeluk cahayanya untuk menghadirkan pelangi.”",
            "“Ya Allah, jangan siksa aku sebab pujian mereka, ampuni pada apa yang mereka tak mengetahuinya, & jadikan aku lebih baik dari segala sangka”",
            "“-Wal akhiratu khairuw wa abqa. Dan akhirat itu lebih baik & lebih kekal-; sayang engkau lebih sibuk mengurus yang lebih buruk & lebih fana”.",
            "“Senyum di wajahmu, yang basah oleh wudhu’, di sela tilawah syahdu; adalah seiris surga yang tersiram madu.”",
            "“Sebab aib & dosa tak tertanda secara kasat di wajah kita, sesama masih berbaik sangka. Mari syukuri itu dengan berjuang menjadi sebenar baik.”",
            "“Aku bukan tak sabar, hanya tak ingin menanti. karena berani memutuskan adalah juga kesabaran. karena terkadang penantian membuka pintu-pintu syaithan”",
            "“Kadang kau harus meneladani matahari. Ia cinta pada bumi ; tapi ia mengerti; mendekat pada sang kekasih justru membinasakan.”",
            "“Janganlah cinta akrab bagai awan dan hujan, merasa hiasi langit, suburkan bumi. Tapi terlambat menyadari bahwa hakikatnya saling meniadai”",
            "“Janganlah cinta lekat bagai api & kayu, bersama menyala, menghangatkan rasanya. Tapi terlambat menginsyafi, tak tersisa selain debu dan abu”",
            "“Sepertinya Iblis salah besar ketika mengatakan api lebih baik dari tanah. Sebab api segitu-gitu saja, sementara harga tanah membubung.” #Joke",
            "“Shalat yang lima, JUMAT KE JUMAT, Ramadhan ke Ramadhan adalah penghapus bagi dosa di antaranya, selama dijauhi dosa besar. (Muttafaq ‘Alaih)”",
            "“Jika kau punya kawan, telah 3 kali marah padamu dan tahu aibmu, tapi tak pernah menjelekkanmu di depan orang, jadikan ia sahabat sejati” #DDU",
            "“Tempat paling aman untuk bersembunyi adalah ruang kejujuran. Tempat yang paling nyaman untuk lari adalah lapangan pertaubatan.”",
            "“Tentu saja sinis tidak sama dengan kritis. Yang tak bisa membedakan keduanya akan kesulitan untuk dianggap berharga semua ucapannya.” #DDU",
            "““Alangkah susah cari kawan”, kata dia. Kujawab saja, “Mungkin kau mencari teman yang memberi. Kalau teman untuk diberi, aduh banyak sekali.”",
            "“Semakin sedikit kebaikan seseorang, makin banyak dia mengharapkan pujian. Semakin sedikit keburukannya, makin tegar dia akan celaan.” #DDU",
            "“Jauh lebih mudah mendapat kawan dengan tertarik pada orang lain, daripada dengan mencoba membuat orang lain tertarik pada diri kita.” #DDU",
            "“Berikan nasehat pada seseorang dalam sunyi dan rahasia. Sebab nasehat di tengah ramai terasa sebagai hinaan yang melukai.” #AsySyafi‘i",
            "“Menikahi orang yang dicintai, hanya kemungkinan. Mencintai orang yang dinikahi, jelas kewajiban.” #BMC",
            "“Jadilah kawan yang mengetahui kelemahan tapi menunjukkan kekuatan, mengenali ketidakmampuan tapi memberi kesempatan. Dunia akan takluk!” #DDU",
            "“Iman tak menjamin kau selalu berlimpah dan tertawa. Iman hanya menjaminmu bisa merasakan kelembutan tanganNya pada apapun dera yang menimpa”",
            "“Bicara benar di waktu tepat itu tak mudah. Lebih sulit lagi, tak mengatakan yang keliru di saat paling menggoda untuk mengucapkannya.” #DDU",
            "“Kerjakan yang semestinya kita kerjakan. Sebab jika tidak, kita akan mendapat kesulitan yang semestinya tidak kita dapatkan.” <Siroj>",
            "“Berdirimu di waktu malam, sujudmu yang dalam, mengokohkan hatimu melebihi gunung membiru. Lalu kau terima beban tuk mencintai semesta.” #Nabi",
            "“Rabbi, Kau uji aku dengan nikmat lalu aku bisa bersyukur, lebih aku sukai daripada Kau uji aku dengan musibah lalu aku harus bersabar.” <AD>"
    };

    // Method (abilities: things the object can do)
    public String getQuotes() {

        String quote = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mQuotes.length);

        quote = mQuotes[randomNumber];

        return quote;
    }
}