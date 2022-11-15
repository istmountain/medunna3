#amazon sayfasina gidip iphone nutella java aratip icerdigini test edin

Feature: kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC-12 Amazonda istedigi kelimeleri aratma

    Given Kullanici "amazon_url" anasayfasinda
    Then kullanici "<istenenkelime>" icin arama yapar
    And sonuclarin "<istenenkelime>" icerdiginin testini yapar
    And sayfayi kapatir

    Examples:

    |istenenkelime|
    |nutella|
    |java   |
    |elma   |
    |armut  |


  Scenario Outline: TC-13 Amazonda istedigi kelimeleri aratma

    Given Kullanici "amazon_url" anasayfasinda
    Then kullanici "<istenenkelime>" icin arama yapar
    And sonuclarin "<istenenkelimekontrol>" icerdiginin testini yapar
    And sayfayi kapatir

    Examples:

      |istenenkelime| |istenenkelimekontrol|
      |nutella|       |nutella             |
      |java   |       |java                |
      |elma   |       |elma                |
      |armut  |       |armut               |
