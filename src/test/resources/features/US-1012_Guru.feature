Feature: Guru olusturma

  @guru
  Scenario: TC-15 kullanici sutun basligi ile istenen sutunun listesini alabilmeli

    Given Kullanici "guruUrl" anasayfasinda
    And kullanici 5 saniye bekler
    And  Cerezleri kabul eder
    And "Current Price (Rs)" degerlerinin tumunu yazdirir
    And sayfayi kapatir

