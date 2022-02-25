@US009
Feature: Kullanici shoppingListe urunler ekleyip silebilmeli.
  Scenario: Kullanici istedigi urunleri istedigi listeye ekleyebilmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Arama butonuna aranan kelime yazilir ve aranir.
   And  Istenilen urune tiklanir ve Add to List butonundan secerek istenilen listeye eklenir.
   Then Listede eklenen urunun varligi kontrol edilir.

  Scenario: Kullanici istedigi urunleri istedigi listeden silebilmeli.
   When Kullanici www.amazon.com sayfasina gider.
   And  Gecerli kullanici bilgileri ile sisteme giris yapar.
   And  Accounts & Lists sekmesinden urun silinmesi istenilen listeye tiklar.
   Then Silmek istedigi urune ait Delete butonuna basar. Ilgili satirda Deleted yazisinin goruldugu test edilir.