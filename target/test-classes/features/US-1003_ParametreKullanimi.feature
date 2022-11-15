Feature: kullanici parametre kullanarak arama yapabilmeli

 @parametre
  Scenario: kullanici parametre kullanarak arama yapabilmeli

    Given Kullanici amazon anasayfasinda
    And kullanici "Oukitel" icin arama yapar
    And sonuclarin "Oukitel" icerdiginin testini yapar
    And sayfayi kapatir


