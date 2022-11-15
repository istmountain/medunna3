Feature: Your logo da hesap olusturma

  Scenario: TC-16 Yourlogo sayfasinda hesap olusturma

    Given Kullanici "yourlogoUrl" anasayfasinda
    And kullanici Sing in linkine tiklar
    And kullanici 5 saniye bekler
    And kullanici Create an Account bolumune email adresi girer
    And Create an account bolumunu tiklar
    And kullanici 5 saniye bekler
    And Kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici register butonunu tiklar
    And Kullanici hesap olustugunu dogrular