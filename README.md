# Java Socket Web Server

## Proje Hakkında
Bu proje, Java Socket programlama kullanılarak geliştirilmiş basit bir web sunucusudur. Java'nın standart kütüphaneleri kullanılarak oluşturulmuştur ve herhangi bir üçüncü parti kütüphane gerektirmez.

Sunucu, 1989 portu üzerinden gelen HTTP isteklerini karşılar ve tarayıcıya HTML ve CSS ile hazırlanmış kişisel biyografi sayfasını gönderir.

## Kullanılan Teknolojiler
- Java 21
- Socket Programlama
- ServerSocket
- HTTP Protokolü
- HTML5
- CSS3
- IntelliJ IDEA

## Projenin Özellikleri
- 1989 portunda çalışır.
- Tarayıcıdan gelen bağlantıları kabul eder.
- HTTP isteğini karşılar.
- HTML formatında biyografi sayfası sunar.
- CSS kullanılarak sayfa tasarımı yapılmıştır.
- Üçüncü parti kütüphane kullanılmamıştır.

## Proje Yapısı

| Dosya | Görevi |
|---|---|
| Main.java | Uygulamayı başlatır. |
| WebServer.java | Sunucuyu başlatır ve bağlantıları kabul eder. |
| ClientHandler.java | İstemciden gelen HTTP isteğini işler. |
| HtmlPage.java | HTML sayfasını oluşturur. |
| PageProvider.java | HTML sayfası sağlayan sınıflar için arayüzdür. |
| HttpResponse.java | HTTP yanıtını tarayıcıya gönderir. |

## Nasıl Çalıştırılır?
1. Proje IntelliJ IDEA ile açılır.
2. `Main.java` dosyası çalıştırılır.
3. Sunucu 1989 portunda başlatılır.
4. Web tarayıcısına aşağıdaki adres yazılır:

   http://localhost:1989

## Amaç
Bu projenin amacı Java Socket programlama kullanarak istemci-sunucu iletişimini öğrenmek, HTTP istek ve yanıtlarının çalışma mantığını anlamak ve temel bir web sunucusu geliştirmektir.
