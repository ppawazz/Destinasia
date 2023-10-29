package com.example.destinasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DESTINATION = "extra_destination"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_about -> {
                val intent_about = Intent(this, AboutActivity::class.java)
                startActivity(intent_about)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun destinationList(): List<Destination> {
        val listDestinasi = mutableListOf<Destination>()

        listDestinasi.add(
            Destination(
                "Raja Ampat",
                "Kepulauan Raja Ampat berada di bagian paling barat Papua dan membentang di area seluas kurang lebih 4,6 juta hektar. Kabupaten Raja Ampat terdiri dari 4 pulau besar yaitu Pulau Waigeo, Batanta, Salawati dan Misool, dan 1.847 pulau-pulau kecil lainnya. Nah, nama Raja Ampat sendiri diyakini berasal dari legenda masyarakat setempat yang percaya bahwa zaman dahulu kala ada seorang wanita yang menemukan tujuh telur, empat telur tersebut menetas menjadi raja-raja yang berkuasa di empat pulau utama. Tersisa tiga lainnya, satu menjadi batu, satu menjadi wanita, dan satu lagi menjadi makhluk gaib atau hantu.Terlepas legenda yang dipercayai masyarakat setempat, keindahan yang disuguhkan oleh Raja Ampat merupakan fakta yang tak bisa diganggu gugat.\n" +
                        "Bagi Sobat Pesona yang gemar diving dan snorkeling, wilayah perairan Raja Ampat adalah salah satu destinasi diving terbaik di dunia. Menurut laporan sebuah organisasi sosial lingkungan internasional, The Nature Conservancy and Conservation International, sekitar 75% spesies karang di dunia hidup di kepulauan Raja Ampat. Destinasi ini memiliki kekayaan dan keunikan spesies yang tinggi dengan ditemukannya 1.318 jenis ikan, 699 jenis moluska (hewan lunak), dan 537 jenis terumbu karang. Rasakan sendiri sensasi menyelam dan bertemu dengan ragam jenis biota laut yang unik, seperti kuda laut kerdil (pygmy seahorse), ikan kelelawar, hingga dugong bisa kamu temukan di wilayah perairan Raja Ampat.\n",
                R.drawable.raja_ampat
            )
        )

        listDestinasi.add(
            Destination(
                "Danau Toba",
                "Danau Toba adalah sebuah keajaiban alam yang sangat menakjubkan. Danau ini diperkirakan terbentuk dari letusan dahsyat sebuah gunung api, Gunung Toba, yang terjadi sekitar 74.000 tahun yang lalu. Dengan luas lebih dari 1.145 kilometer persegi dan kedalaman 450 meter, Danau Toba sebenarnya lebih mirip lautan daripada danau. Di tengah danau vulkanik terbesar di dunia ini juga terdapat sebuah pulau yang berukuran cukup besar, yaitu Pulau Samosir.\n" +
                        "Danau Toba menjadi tempat yang sempurna untuk bersantai, karena udaranya sangat sejuk dan suasananya pun amat tenang. Tentu saja, sebab letak Danau Toba berada di 900 meter di atas permukaan laut. Selain panorama danau yang memukau, Sobat Pesona juga akan disuguhkan keindahan pemandangan deretan pegunungan dan pepohonan hijau yang menyegarkan mata.",
                R.drawable.danau_toba
            )
        )

        listDestinasi.add(
            Destination(
                "Pulau Sumba",
                "Pulau Sumba, salah satu surga eksotis di wilayah timur Indonesia! Hamparan sabana yang luas, bukit kapur yang berjejer, serta kemegahan alam yang begitu indahnya melebur secara sempurna dengan kearifan lokal masyarakatnya yang begitu istimewa. Desa-desa di pulau ini mayoritas didirikan di puncak bukit dengan bentuk rumah yang masih mengusung konsep tradisional beratap jerami. Mayoritas rumah-rumahnya dibangun di dekat makam leluhur, karena sebagian besar warga setempat memeluk kepercayaan Marapu, yakni kepercayaan untuk memuja nenek moyang atau leluhur.\n" +
                        "Letaknya yang berbatasan langsung dengan Samudra Hindia, menjadikan Pulau Sumba sebagai surga untuk para peselancar. Tinggi ombak di pulau ini biasanya antara 1 hingga 2 meter. Sedangkan, ombak yang tertinggi biasanya muncul pada bulan Mei hingga Oktober. Nah, karena arusnya cukup kuat, hanya peselancar profesional saja yang disarankan berselancar di sini.",
                R.drawable.pulau_sumba
            )
        )

        listDestinasi.add(
            Destination(
                "Gunung Rinjani",
                "Dengan ketinggian 3.726 mdpl dan terletak di utara Pulau Lombok, Gunung Rinjani merupakan gunung berapi kedua tertinggi di Indonesia. Masuk dalam kawasan Taman Nasional Gunung Rinjani dan dikelilingi oleh hutan dan semak belukar seluas 76.000 hektar merupakan pemandangan yang asri bagi Gunung Rinjani.\n" +
                        "Akses menuju Pulau Lombok selain dapat ditempuh melalui jalur darat menggunakan bus langsung Jakarta – Mataram dengan menyeberang menggunakan kapal ferry dua kali (Selat Bali dan Selat Lombok), juga dapat ditempuh dengan menggunakan pesawat terbang.\n" +
                        "Gunung Rinjani memiliki kawah dengan lebar sekitar 10 km dan terdapat danau kawah yang disebut danau Segara Anak dengan kedalaman sekitar 230 m. Dengan warna airnya yang membiru bagaikan anak lautan, air yang mengalir dari danau ini membentuk air terjun yang sangat indah dan mengalir melewati jurang yang curam. Banyak para pendaki yang memancing di danau ini karena banyak terdapat ikan mas dan mujair.",
                R.drawable.gunung_rinjani
            )
        )

        listDestinasi.add(
            Destination(
                "Pantai kuta",
                "Bali sebagai “surga terakhir di bumi” takkan lengkap tanpa Pantai Kuta. Bersama Sanur, Kuta adalah salah satu pantai paling ikonik di Bali.\n" +
                        "Memasuki wilayah pantai, pengunjung akan disambut sebuah gapura megah berbentuk candi bentar. Gapura ini merupakan penanda sisi paling selatan dari kawasan Kuta. Setelahnya, pengunjung akan disuguhi pemandangan pantai yang memanjang sekitar 10 km, pasir putih yang lembut, dan ombak yang ramah untuk berselancar.\n" +
                        "Kuta sudah menjadi salah satu destinasi wajib wisatawan yang berkunjung ke Bali. Namun, siapa sangka Pantai Kuta dulunya merupakan tempat buangan, pelarian, hingga penderita kusta. Selain itu Kuta juga dikenal sebagai pelabuhan dagang yang sibuk.",
                R.drawable.pantai_kuta
            )
        )

        listDestinasi.add(
            Destination(
                "Karimunjawa",
                "Terdiri dari 27 pulau tropis yang masih asli tersebar di sepanjang laut Jawa, Karimunjawa Nusantara adalah salah satu kabupaten di bawah Kabupaten Jepara Provinsi Jawa Tengah. Beberapa pulau dibentuk oleh terumbu karang dan ditutup dengan lapisan pasir. Pulau-pulau ini menyembunyikan berbagai potensi pesona keindahan alam, pegunungan, pasir putih pantai, dan dunia bawah laut. Taman Nasional Karimunjawa terletak sekitar 45 mil laut dari Jepara dan 80 mil laut dari Semarang.",
                R.drawable.karimunjawa
            )
        )

        listDestinasi.add(
            Destination(
                "Wakatobi",
                "Kepulauan Wakatobi terdiri atas empat pulau yaitu Pulau Binongko, Pulau Tomia, Pulau Kaledupa, Pulau Wangi-wangi. Selain itu, beberapa obyek wisata yang menarik, di antaranya Pantai Kaluku, Pantai Moli’i Sahatu, Pantai Jodoh, Pantai Melai One, Pantai Waikesa, Pantai Sousu, dan Pantai Waha atau Pantai Cemara.\n" +
                        "Wakatobi pada 2016 ditetapkan pemerintah menjadi salah satu dari sepuluh destinasi pariwisata prioritas di Indonesia. Destinasi prioritas lainnya adalah Borobudur, Danau Toba, Taman Nasional Bromo, Tengger, Semeru; Pulau Komodo, Pulau Seribu, Tanjung Kelayang, Mandalika, Wakatobi, Morotai, dan Tanjung Lesung.",
                R.drawable.wakatobi
            )
        )

        listDestinasi.add(
            Destination(
                "Malioboro",
                "Berkunjung ke kota Yogyakarta merupakan pilihan yang tepat untuk mengisi hari libur bersama keluarga terutama anak-anak. Hal tersebut dikarenakan tempat wisata di Yogyakarta tidak hanya sekedar tempat wisata yang menyuguhkan panorama keindahan yang memikat hati, tapi juga menjadi sarana edukasi bagi anak-anak dalam mengenal kebudayaan serta sejarah yang ada di kota tersebut. Salah satu yang menjadi ikon dari kota Jogja adalah jalan Malioboro Yogyakarta yang merupakan tempat yang selalu ramai baik siang maupun malam.",
                R.drawable.malioboro
            )
        )

        listDestinasi.add(
            Destination(
                "Pulau Natuna",
                "Kabupaten Natuna, adalah salah satu kabupaten di Provinsi Kepulauan Riau, Indonesia. Natuna merupakan kepulauan paling utara di selat Karimata. Di sebelah utara, Natuna berbatasan dengan Vietnam dan Kamboja, di selatan berbatasan dengan Sumatera Selatan dan Jambi, di bagian barat dengan Singapura, Malaysia, Riau dan di bagian timur dengan Malaysia Timur dan Kalimantan Barat.\n" +
                        "Natuna berada pada jalur pelayaran internasional Hongkong, Jepang, Korea dan Taiwan. Kabupaten ini terkenal dengan penghasil minyak dan gas. Cadangan minyak bumi Natuna diperkirakan mencapai 14.386.470 barel, sedangkan gas bumi 112.356.680 barel.Sejarah Kabupaten Natuna tidak dapat dipisahkan dari sejarah Kabupaten Kepulauan Riau, karena sebelum berdiri sendiri sebagai daerah otonomi, Kabupaten Natuna merupakan bahagian dan Wilayah Kepulauan Riau. Kabupaten Natuna dibentuk berdasarkan Undang-Undang No. 53 Tahun 1999 yang disahkan pada tanggal 12 Oktober 1999, dengan dilantiknya Bupati Natuna Drs. H. Andi Rivai Siregar oleh Menteri Dalam Negeri ad interm Jenderal TNI Faisal Tanjung di Jakarta.",
                R.drawable.pulau_natuna            )
        )

        listDestinasi.add(
            Destination(
                "Kawah Ijen",
                "Wisata Kawah Ijen menjadi salah satu destinasi wisata alam yang menjadi bucket list banyak orang.\n" +
                        "Tempat wisata alam ini menyajikan pemandangan yang sangat indah sehingga tak hanya menarik wisatawan lokal, tapi juga mancanegara.\n" +
                        "Kawah Ijen adalah sebuah wisata alam berupa danau asam yang warnanya hijau kebiruan dengan diameter sekitar 700 meter dan luas mencapai 5.466 hektar.\n" +
                        "Kawah Ijen memiliki kedalaman hingga 200 meter dan volume danau bisa mencapai 36 juta meter kubik.\n" +
                        "Danau ini terbentuk secara alami akibat letusan Gunung Ijen yang masih aktif hingga akhirnya membentuk lekukan besar dan menjadi sebuah danau.",
                R.drawable.kawah_ijen
            )
        )
        return listDestinasi
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_destinasi)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val destinations = destinationList()
        recyclerView.adapter = DestinationAdapter(destinations, this)
    }

}