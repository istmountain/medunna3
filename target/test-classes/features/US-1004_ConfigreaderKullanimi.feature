Feature: kullanici parametre ile ConfigurationReader kullanabilmeli


  @config
  Scenario:TC-007 Configuration properties den parametre kullanabilmeli

      Given Kullanici "hepsi_burada" anasayfasinda
      And kullanici 3 saniye bekler
      And Kullanici Url nin "hepsiburada" icerdigini test eder
      And sayfayi kapatir