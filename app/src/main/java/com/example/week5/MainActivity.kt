package com.example.week5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("Troye Sivan","Dua Lipa","Adam Noah","Billie Eilish","Lauv","Ashley Nicolette","Taylor Swift","Shawn Peter","Edward", "Anne-Marie")

    val priceArr = arrayOf("เกิดเมื่อวันที่ 5 มิถุนายน 1995 เป็นชาวแอฟริกาใต้ สัญชาติออสเตรเลีย เกิดที่แอฟริกาใต้ โด่งดังจากการโชว์ความสามารถเป็นนักแสดงและนักร้องบนยูทูบ เมื่ออายุได้ 15 ปี ทรอย ซีวานสารภาพกับครอบครัวของเขาว่าตนเองเป็นเกย์ และในอีกสามปีถัดมา ก็ได้ประกาศต่อสาธารณชนเกี่ยวกับรสนิยมทางเพศของเขาอย่างเป็นทางการผ่านทางยูทูบ เมื่อวันที่ 13 ตุลาคม 2014 ซีวานยังถูกนิตยสารไทม์ ชื่อดังจัดอันดับให้ ทรอย ซีวานติด 1 ใน 25 วัยรุ่นที่ทรงอิทธิพลที่สุดในโลก ประจำปี 2014 อีกด้วย\n" +
            "ด้านศิลปิน ทรอย ซีวานได้ปล่อยอีพีตัวแรกในชื่อ Dare To Dream วันที่ 5 มิถุนายน 2013 ซีวานได้เซ็นสัญญาเป็นนักร้องกับค่ายเพลง อีเอ็มไอ ออสเตรเลีย ในเครือของยูนิเวอร์ซัลมิวสิคกรุ๊ป แล้วได้ปล่อยอีพีในชื่อ TRXYE ไปเมื่อเดือน สิงหาคม 2014 ในปี 2015 ได้ปล่อยอีพีที่สองในชื่อ WILD และตามด้วยอัลบั้มแรกในชื่อ Blue Neighbourhood และในปี 2018 ได้ปล่อยอัลบั้มที่สองในชื่อ Bloom\n" +
            "ด้านการแสดง ทรอย ซีวานได้รับบทเป็น เจมส์ ฮาวเล็ต หรือในชื่อ เจมส์ โลแกน ในวัยเด็ก จากภาพยนตร์เรื่อง เอ็กซ์เมน กำเนิดวูล์ฟเวอรีน ต่อมาเขาได้รับบทนำในหนังเรื่อง Spud ที่ดัดแปลงจากนิยายวัยรุ่นชื่อดังของ จอนเวน เด รูท ที่สร้างความโด่งดังให้กับซีวานจนมีการสร้างต่อมาถึง 3 ภาค และเขายังได้รับบท แกรี่ จากภาพยนตร์เรื่อง Boy Erased แล้วเขายังได้แต่งเพลง Revelation ร่วมกับ Jónsi ซึ่งได้เข้าชิงรางวัล Golden Globe สาขา Best Original Song อีกด้วย","ดัว ลีปา (แอลเบเนีย: Dua Lipa; เกิด 22 สิงหาคม ค.ศ. 1995) เป็นนักร้อง นักแต่งเพลง และนางแบบสาวสวยชาวบริติช-แอลเบเนีย[4][5] เธอริเริ่มอาชีพทางดนตรีตั้งแต่อายุ 14 ปี โดยโพสต์เพลงที่เธอนำมาร้องใหม่เองลงบนยูทูบ ในปี ค.ศ. 2015 เธอเซ็นสัญญากับค่ายวอร์เนอร์มิวสิกกรุปและออกซิงเกิลแรก \"นิวเลิฟ\" ในเดือนธันวาคม ค.ศ. 2016 เธอออกภาพยนตร์สารคดีชีวประวัติเรื่อง ซีอินบลู ผ่านทางเดอะแฟดเดอร์ อัลบั้มแรกของลีปามีชื่อเดียวกับตนเอง วางจำหน่ายในเดือนมิถุนายน ค.ศ. 2017 อัลบั้มขึ้นอันดับห้าบนชาร์ตอัลบั้มแห่งสหราชอาณาจักร และซิงเกิลที่หกจากอัลบั้ม \"นิวรูลส์\" กลายเป็นเพลงแรกของเธอที่ขึ้นอันดับ 1 บนชาร์ตซิงเกิลแห่งสหราชอาณาจักร ในปีเดียวกัน ลีปาได้รับรางวัลเอ็นเอ็มอีสาขาศิลปินหน้าใหม่ยอดเยี่ยม และได้รับการเสนอชื่อเข้าชิงรางวัลบริตอะวอดส์ในสาขาขวัญใจนักวิจารณ์"
            ,"แอดัม โนอาห์ เลอวีน (อังกฤษ: Adam Noah Levine; เกิด 18 มีนาคม ค.ศ. 1979) เป็นนักร้อง นักแต่งเพลง นักดนตรี และนักแสดงชาวอเมริกัน รู้จักกันในฐานะนักร้องนำของวงดนตรีป็อปร็อกจากลอสแอนเจลิส มารูนไฟฟ์\n" +
                "แอดัม เกิดและเติบโตในลอสแอนเจลิส แคลิฟอร์เนีย เลอวีนริเริ่มอาชีพทางดนตรีในปี ค.ศ. 1994 หลังจากเขาร่วมตั้งวงดนตรีแนวอัลเทอร์นาทีฟร็อกในชื่อ คาราส์ฟลาวเออส์ เขาร้องนำและเป็นนักกีตาร์ หลังจากออกอัลบั้มแรกและอัลบั้มเดียวในชื่อ เดอะโฟร์ธเวิลด์ และไม่ประสบความสำเร็จ ทำให้เขาต้องยุบวง หลังจากนั้น เขารวมตัวกันอีกครั้งและได้สมาชิกคนที่ห้าเข้าร่วมวงและตั้งวงดนตรีชื่อ มารูนไฟฟ์ วงปล่อยอัลบั้มแรก ซองส์อะเบาต์เจน ที่ได้รางวัลรับรองระดับแพลตินัมในสหรัฐอเมริกา หลังจากนั้น เขาออกอัลบั้มอีก 4 อัลบั้ม คือ อิตโวนต์บีซูนบีฟอร์ลอง (ค.ศ. 2007) แฮนส์ออลโอเวอร์ (ค.ศ. 2010) โอเวอร์เอกซ์โพสด์ (ค.ศ. 2012) และ ไฟฟ์ (ค.ศ. 2014) ในนามมารูนไฟฟ์ เขาได้รับรางวัลแกรมมี 3 สาขา รางวัลจากบิลบอร์ดมิวสิกอะวอร์ด 2 สาขา รางวัลจากอเมริกันมิวสิกอะวอร์ด 2 สาขา รางวัลจากเอ็มทีวีวิดีโอมิวสิกอะวอร์ด และเวิลด์มิวสิกอะวอดส์\n" +
                "ตั้งแต่ ค.ศ. 2011 เลอวีนรับหน้าที่เป็นโคชในรายการเรียลลิตีโชว์ เดอะวอยซ์ ทางช่องเอ็นบีซี มีผู้ชนะจากรายการในฤดูกาลที่หนึ่ง ห้า และเก้า ฮาเวียร์ โคลอน เทสแซน ชิน และจอร์แดน สมิธ มาจากทีมของเลอวีน ในปี ค.ศ. 2012 เขาแสดงเป็นตัวละครรองในละครแนวสยองขวัญ อเมริกันฮอร์เรอร์สตอรี: อะไซลัม ฤดูกาลที่สอง เขายังปรากฏในภาพยนตร์เรื่อง เพราะรัก คือเพลงรัก (Begin Again) ด้วย\n" +
                "ในปี ค.ศ. 2013 เลอวีนยังลงทุนทำธุรกิจน้ำหอมโดยตั้งชื่อน้ำหอมที่เป็นชื่อเดียวกับเขา ในปีเดียวกันนั้น เขาร่วมมือกับเคมาร์ต และเว็บไซต์ ShopYourWay.com ผลิตคอลเลกชันเสื้อผ้าผู้ชาย เขายังเป็นเจ้าของค่ายเพลง 222 เรเคิดส์ ในปี ค.ศ. 2013 เดอะฮอลลีวูดรีพอร์เตอร์ รายงานว่า \"แหล่งข่าวแหล่งหนึ่งที่สัมพันธ์กับหลายธุรกิจของเลอวีน\" ประมาณว่าเลอวีนมีรายได้มากกว่า 35 ล้านดอลลาร์ในปีนั้นเอง","บิลลี ไอลิช ไพเรต เบร์ด โอคอนเนลล์ (อังกฤษ: Billie Eilish Pirate Baird O'Connell) (เกิด 18 ธันวาคม พ.ศ. 2544) เป็นนักร้อง นักแต่งเพลง นางแบบ ชาวอเมริกัน เป็นที่รู้จักในปี พ.ศ. 2559 หลังออกซิงเกิ้ลเปิดตัวซิงเกิ้ลแรก \"Ocean Eyes\" ที่เผยแพร่ทางซาวด์คลาวด์ ต่อมาซิงเกิ้ลออกวางขายอีกครั้งภายใต้สังกัดดาร์กรูมและอินเทอร์สโคปเรเคิดส์\n" +
                "อีพีแรกของเธอ Don't Smile at Me (พ.ศ. 2560) ติดในท็อป 15 ในสหรัฐอเมริกา สหราชอาณาจักร แคนาดา และออสเตรเลีย และตามมาด้วยซิงเกิล \"Bellyache\" ไอลิชยังได้ร่วมงานกับนักร้องชาวอเมริกัน คาลิด ในซิงเกิ้ล \"Lovely\" ออกจำหน่ายในเดือนเมษายน พ.ศ. 2560 และอยู่ในอัลบั้มเพลงประกอบภาพยนตร์ในฤดูกาลที่ 2 ของซีรีส์ 13 Reasons Why สตูดิโออัลบั้มเปิดตัวที่ชื่อ When We All Fall Asleep, Where Do We Go? (พ.ศ. 2562) ขึ้นอันดับ 1 บนบิลบอร์ด 200 รวมถึงสหราชอาณาจักร แคนาดาและออสเตรเลีย อัลบั้มมี 4 ซิงเกิ้ลที่ติดใน 40 อันดับของอเมริกา คือ \"When the Party's Over\", \"Bury a Friend\", \"Wish You Were Gay\", และ \"Bad Guy\"\n" +
                "จากข้อมูลของ RIAA ไอลิชได้รับรางวัลแผ่นเสียงทองคำ 7 แผ่น และแผ่นเสียงทองคำ 2 แผ่น จากการจำหน่ายซิงเกิ้ล"
                ,"อารี สเตแพรนส์ เลฟฟ์ (อังกฤษ: Ari Staprans Leff) หรือรู้จักในชื่อ เลาฟ์ (อังกฤษ: Lauv) เกิดเมื่อวันที่ 8 สิงหาคม ค.ศ. 1994 เป็นนักร้อง นักแต่งเพลง โปรดิวเซอร์เพลง ชาวอเมริกัน อาศัยอยู่ที่เมืองลอสแอนเจลิส เขามีผลงานอีพีชุดเปิดตัวที่ชื่อ Lost in the Light[2] ออกในปี 2015 [3][4] และออกอัลบัมรวมเพลง I Met You When I Was 18 (The Playlist) ออกในปี 2018 เขาแต่งเพลงให้กับศิลปินอื่นอีกหลายเพลง อาทิ \"Boys\" ของ ชาร์ลีเอกซ์ซีเอกซ์ และ \"No Promises\" ของ ชีตโคตส์ และ เดมี โลวาโต สตูดิโออัลบัมชุดแรก How I'm Feeling ออกในปี 2019","แอชลีย์ นิคเกอร์เนต แฟรนจิเพน (อังกฤษ: Ashley Nicolette Frangipane; เกิด 29 กันยายน พ.ศ. 2537) หรือที่รู้จักกันในนาม ฮาลซีย์ (Halsey)[2] เป็นนักร้องและนักแต่งเพลงชาวอเมริกัน เธอเป็นที่รู้จักกันมากในอินเทอร์เน็ตหลังจากเธอโคฟเวอร์เพลงลงยูทูบ ในปี พ.ศ. 2557 เธอเปิดตัวอีพีในชื่อ Room93 ในวันที่ 28 สิงหาคม พ.ศ. 2558 แฟรนจิเพนปล่อยอัลบั้มเปิดตัวครั้งแรกในชื่อ Badlands และภายในเวลาอันรวดเร็วเธอติด 1 ใน 10 นักร้องที่น่าติดตามของนิตยสารไทม์อีกด้วย"
                ,"เทย์เลอร์ แอลิสัน สวิฟต์ (อังกฤษ: Taylor Alison Swift; เกิด 13 ธันวาคม ค.ศ. 1989) เป็นนักร้องและนักแต่งเพลงชาวอเมริกัน เธอเป็นหนึ่งในศิลปินหญิงร่วมสมัยยอดนิยมที่เป็นที่รู้จักจากการแต่งเพลงเกี่ยวกับชีวิตส่วนตัวและเป็นที่สนใจของสื่ออย่างมาก\n" +
                "สวิฟต์เกิดเติบโตในรัฐเพนซิลเวเนีย ต่อมาเธอได้ย้ายไปยังเมืองแนชวิลล์ รัฐเทนเนสซี ขณะอายุ 14 ปี เพื่อหางานทำเกี่ยวกับเพลงคันทรี เธอได้เซ็นสัญญากับค่ายเพลงบิกแมชีนเรเคิดส์ และเป็นนักแต่งเพลงที่อายุน้อยที่สุดที่ได้เซ็นสัญญากับบริษัทโซนี/เอทีวีมิวสิกพับบลิชชิง อัลบั้มแรกของสวิฟต์มีชื่อเดียวกับตนเอง วางจำหน่ายในปี ค.ศ. 2006 อัลบั้มเปิดตัวที่อันดับห้าในชาร์ตบิลบอร์ด 200 และอยู่ในชาร์ตได้นานที่สุดในทศวรรษ 2000 ซิงเกิลที่สาม \"อาวเวอร์ซอง\" ทำให้เธอเป็นคนที่อายุน้อยที่สุดที่แต่งเพลงด้วยตนเองและเพลงขึ้นอันดับหนึ่งบนชาร์ตบิลบอร์ดฮอตเพลงคันทรี อัลบั้มที่สอง เฟียร์เลส ออกจำหน่ายในปี ค.ศ. 2008 หลังจากสามารถติดชาร์ตเพลงป็อป (pop crossover) ได้สำเร็จ ซิงเกิล \"เลิฟสตอรี\" และ \"ยูบีลองวิทมี\" ทำให้อัลบั้มเฟียร์เลสเป็นอัลบั้มที่ขายดีที่สุดในสหรัฐในปี ค.ศ. 2009 อัลบั้มชนะรางวัลแกรมมี 4 รางวัล และสวิฟต์เป็นนักร้องที่อายุน้อยที่สุดที่ได้รับรางวัลแกรมมีสาขาอัลบั้มเพลงแห่งปี"
                ,"ชอว์น ปีเตอร์ ราอูล เมนเดส (อังกฤษ: Shawn Peter Raul Mendes เกิด 8 สิงหาคม ค.ศ. 1998) เป็นนักร้อง นักแต่งเพลง และนายแบบชาวแคนาดา เขากลายเป็นที่สนใจในปี 2013 หลังจากเขาโพสต์เพลงที่นำมาร้องใหม่เองลงในโปรแกรมประยุกต์แชร์วิดีโอชื่อ ไวน์ ในปีต่อมา เขาเป็นที่สนใจของแอนดรูว์ เกิร์ตเลอร์ ผู้จัดการศิลปิน และซิกกี แชร์ตัน ฝ่ายคัดสรรและพัฒนาศิลปินของค่ายไอส์แลนด์เรเคิดส์ และทำให้เขาเซ็นสัญญากับค่าย เมนเดสออกอีพีหนึ่งชุด และสตูดิโออัลบั้มแรก แฮนด์ริตเทน โดยมีซิงเกิล \"สติตเชส\" ขึ้นถึงสิบอันดับแรกในสหรัฐอเมริกาและแคนาดา และอันดับหนึ่งในสหราชอาณาจักร อัลบั้มที่สอง อิลลูมิเนต (2016) นำด้วยซิงเกิล \"ทรีตยูเบตเทอร์\" อัลบั้มสองอัลบั้มแรกขึ้นอันดับหนึ่งบนชาร์"
                ,"เอ็ดเวิร์ด คริสโตเฟอร์ \"เอ็ด\" ชีแรน (อังกฤษ: Edward Christopher \"Ed\" Sheeran) เกิดเมื่อวันที่ 17 กุมภาพันธ์ ค.ศ. 1991[1] เป็นนักร้อง นักแต่งเพลง และนักแสดงชาวอังกฤษ[2][3] เขาเกิดในฮาลิแฟกซ์ เวสต์ยอร์กไชร์ และเติบโตในแฟรมลิงแฮม ซัฟฟอล์ก เขาเข้าเรียนสถาบันดนตรีร่วมสมัย ในกิลฟอร์ด เซอร์รีย์ ในระดับปริญญาตรีตั้งแต่อายุ 18 ปีในฤดูใบไม้ร่วงปี ค.ศ. 2009[4][5] ในต้นปี ค.ศ. 2011 ชีแรนออกอีพีชุด นัมเบอร์ไฟฟ์คอลลาบอเรชันส์โปรเจกต์ โดยไม่มีสังกัด และกลายเป็นที่สนใจของเอลตัน จอห์น และเจมี ฟ็อกซ์ หลังจากเซ็นสัญญากับค่ายอะไซลัมเรเคิดส์ อัลบั้มแรกของเขา + (อ่านว่า \"พลัส\") ออกจำหน่ายในเดือนกันยายน ค.ศ. 2011 และได้รับการรับรองระดับแพลตินัม 6 ครั้งในสหราชอาณาจักร อัลบั้มมีซิงเกิล \"ดิเอทีม\" ทำให้เขาได้รับรางวัลไอวอร์โนเวลโลอะวอร์ด สาขาเพลงยอดเยี่ยมด้านดนตรีและเนื้อเพลง[6] ในปี ค.ศ. 2012 ชีแรนได้รับรางวัลบริตอะวอดส์ สาขาศิลปินเดี่ยวชายชาวบริติชยอดเยี่ยม และศิลปินแจ้งเกิดชาวบริติช[7]"
                ,"Anne-Marie Rose Nicholson (เกิด 7 เมษายน 1991) เป็นนักร้องและนักแต่งเพลงชาวอังกฤษ เธอได้บรรลุผังเดี่ยวหลายรายการในชาร์ทซิงเกิลของUKรวมถึงClean Rockitของ \" Rockabye \" ที่มีSean Paulซึ่งได้อันดับหนึ่งเป็นอันดับหนึ่งเช่นเดียวกับ \" Alarm \", \" Ciao Adios \", \" Friends \" และ \" 2002 \" . [2]เปิดตัวสตูดิโออัลบั้มของเธอพูดใจของคุณได้รับการปล่อยตัววันที่ 27 เมษายน 2018 และที่บ้านเลขที่สามบนสหราชอาณาจักรชาร์ตอัลบั้ม [3]เธอได้รับการเสนอชื่อเข้าชิงสี่รางวัลในงานประกาศผลรางวัลบริตในปี 2562รวมถึงศิลปินเดี่ยวหญิงชาวอังกฤษที่ดีที่สุด")

    val context =this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_RESULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setTitle("ประวัติศิลปิน")

        val mAdp = ArrayAdapter(context, android.R.layout.simple_list_item_1, titleArr)

        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->

            //Toast.makeText(
            //    context, " ศิลปิน = ${titleArr[position]} ราคา ${priceArr[position]}", Toast.LENGTH_LONG).show()
            val goPage = Intent(context, SecoundActivity::class.java)
            goPage.putExtra(KEY_TITLE,titleArr[position])
            goPage.putExtra(KEY_RESULT,priceArr[position])

            startActivity(goPage)

        }
    }
}
