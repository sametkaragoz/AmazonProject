@US002
Feature: Kullanici gecerli bilgilerle giris yapabilmeli, gecersiz bilgilerle giris yapamamali.

  Scenario: Kullanici gecerli username ve password ile sisteme giris yapabilmeli.
    When Kullanici www.amazon.com sayfasina gider.
    And  Sag ustteki 'Hello, Sign in' butonuna basar.
    And  Acilan sayfadaki ilgili kutucuga gecerli e-mail ya da telefon numarasini girer. Continue butonuna basar.
    And  Acilan sayfadaki ilgili kutucuga gecerli passwordu girer. Sign-in butonuna basar.
    And  Acilan sayfada 'Hello 'username'' yazdigi dogrulanir.

  Scenario: Kullanici gecersiz username ve password ile sisteme giris yapamamali.
   When  Kullanici www.amazon.com sayfasina gider.
   And   Sag ustteki 'Hello, Sign in' butonuna basar.
   And   Acilan sayfadaki ilgili kutucuga gecersiz e-mail ya da telefon numarasini girer. Continue butonuna basar.
   And   Gecersiz e-mail ya da telefon numarasi hata mesaji alindigi kontrol edilir.
   And   Kullanici gecerli e-mail ya da telefon numarasini girer. Continue butonuna basar.
   And   Acilan sayfadaki ilgili kutucuga gecersiz passwordu girer. Sign-In butonuna basar.
   Then  Gecersiz password hata mesaji alindigi kontrol edilir.

