public class HtmlPage implements PageProvider {

    @Override
    public String getHtml() {

        return """
                <!DOCTYPE html>
                <html lang="tr">

                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">

                    <title>Tuğçe Yeniay | Benim Hikayem</title>

                    <style>

                        body {
                            background-color: #fff0f5;
                            font-family: Georgia, serif;
                            margin: 0;
                            padding: 40px 20px;
                        }

                        .container {
                            background-color: white;
                            max-width: 900px;
                            margin: auto;
                            padding: 50px;
                            border-radius: 20px;
                            box-shadow: 0 5px 20px rgba(219, 112, 147, 0.15);
                        }

                        .header {
                            text-align: left;
                            border-bottom: 2px solid #f5d5e0;
                            padding-bottom: 25px;
                        }

                        h1 {
                            color: #d65f87;
                            font-size: 43px;
                            margin-bottom: 10px;
                        }

                        .student-number {
                            color: #e58aaa;
                            font-size: 17px;
                        }

                        .intro {
                            color: #999;
                            font-style: italic;
                            font-size: 18px;
                            margin-top: 25px;
                        }

                        .biography {
                            margin-top: 30px;
                        }

                        p {
                            color: #555;
                            font-size: 17px;
                            line-height: 1.9;
                            text-align: justify;
                        }

                        .categories-title {
                            color: #d65f87;
                            font-size: 27px;
                            margin-top: 45px;
                            border-bottom: 1px solid #f5d5e0;
                            padding-bottom: 12px;
                        }

                        .categories {
                            display: grid;
                            grid-template-columns: repeat(2, 1fr);
                            gap: 20px;
                            margin-top: 25px;
                        }

                        .card {
                            background-color: #fff5f8;
                            padding: 22px;
                            border-radius: 12px;
                            border-left: 4px solid #e58aaa;
                        }

                        .card h3 {
                            color: #d65f87;
                            margin-top: 0;
                            font-size: 20px;
                        }

                        .card p {
                            font-size: 15px;
                            line-height: 1.7;
                        }

                        .footer {
                            text-align: center;
                            color: #e58aaa;
                            margin-top: 45px;
                            font-style: italic;
                        }

                        @media (max-width: 600px) {
                            .container {
                                padding: 25px;
                            }

                            .categories {
                                grid-template-columns: 1fr;
                            }

                            h1 {
                                font-size: 34px;
                            }
                        }

                    </style>

                </head>

                <body>

                    <div class="container">

                        <div class="header">

                            <h1>Tuğçe Yeniay</h1>

                            <div class="student-number">
                                Öğrenci No: 1250505028
                            </div>

                        </div>

                        <p class="intro">
                            Kendimi, hayallerimi ve hikayemi keşfedin...
                        </p>

                        <div class="biography">

                            <p>
                                Merhaba, ben Tuğçe Yeniay. 21 yaşındayım ve
                                Kırklareli Üniversitesi Yazılım Mühendisliği
                                bölümünde öğrenim görüyorum. Öğrenmeye açık,
                                meraklı ve kendini geliştirmeyi seven biriyim.
                                Yeni bilgiler edinmek, farklı alanları keşfetmek
                                ve öğrendiklerimi günlük hayatımda uygulamak
                                benim için oldukça önemli.
                            </p>

                            <p>
                                Üniversite hayatım boyunca yazılım dünyasını
                                daha yakından tanıma fırsatı buldum. C, Python
                                ve Java gibi programlama dilleriyle çalışıyor;
                                algoritmalar, veri yapıları ve yazılım geliştirme
                                konularında kendimi geliştirmeye çalışıyorum.
                                Teorik olarak öğrendiklerimi projelere
                                dönüştürmek ve karşılaştığım problemleri
                                çözmek beni motive ediyor.
                            </p>

                            <p>
                                Akademik hayatımın yanında farklı proje
                                çalışmalarında da yer aldım. TEKNOFEST
                                kapsamında havacılıkta yapay zekâ, insansız
                                hava araçları ve sağlıkta yapay zekâ gibi
                                alanlarda gerçekleştirilen çalışmalara katıldım.
                                Bu deneyimler bana araştırmanın, takım
                                çalışmasının ve birlikte üretmenin önemini
                                gösterdi.
                            </p>

                            <p>
                                Boş zamanlarımda resim yapmayı, müzik dinlemeyi
                                ve yürüyüşe çıkmayı seviyorum. Bunun yanında
                                yeni diller öğrenmek, farklı konularda
                                araştırmalar yapmak ve kendime yeni beceriler
                                kazandırmak ilgimi çekiyor. Kendimi yalnızca
                                mesleki açıdan değil, kişisel olarak da
                                geliştirmeyi önemsiyorum.
                            </p>

                            <p>
                                Gelecekte yazılım alanında kendini sürekli
                                yenileyen, üreten ve öğrendiklerini faydalı
                                projelere dönüştüren biri olmak istiyorum.
                                Benim için gelişmek, yalnızca bir hedefe
                                ulaşmak değil; her gün yeni bir şey öğrenerek
                                yoluma devam etmek demek.
                            </p>

                        </div>

                        <h2 class="categories-title">
                            Benim Dünyam
                        </h2>

                        <div class="categories">

                            <div class="card">
                                <h3>Projeler ve Etkinlikler</h3>
                                <p>
                                    TEKNOFEST Havacılıkta Yapay Zekâ,
                                    İnsansız Hava Araçları ve Sağlıkta
                                    Yapay Zekâ proje çalışmaları.
                                </p>
                            </div>

                            <div class="card">
                                <h3>İlgi Alanlarım</h3>
                                <p>
                                    Yazılım geliştirme, teknoloji,
                                    yapay zekâ, algoritmalar ve
                                    yeni diller öğrenmek.
                                </p>
                            </div>

                            <div class="card">
                                <h3>Hobilerim</h3>
                                <p>
                                    Resim yapmak, müzik dinlemek,
                                    yürüyüş yapmak ve yeni şeyler keşfetmek.
                                </p>
                            </div>

                            <div class="card">
                                <h3>Gelecek Hedeflerim</h3>
                                <p>
                                    Yazılım alanında uzmanlaşmak,
                                    kendimi sürekli geliştirmek ve
                                    faydalı projeler üretmek.
                                </p>
                            </div>

                        </div>

                        <div class="footer">
                            Benim hikayem henüz yazılmaya devam ediyor...
                        </div>

                    </div>

                </body>
                </html>
                """;
    }
}