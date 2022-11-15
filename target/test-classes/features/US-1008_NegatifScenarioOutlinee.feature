Feature: kullanici yanlis username ve yanlis password ile giris yapamaz

  Scenario Outline: TC-13 yanlis username ve sifre ile giris yapamaz

    Given Kullanici "hotel_my_camp" anasayfasinda
    Then login yazisina tiklar
    And kullanici yanlis username "<username>" girer
    And kullanici yanlis password "<sifre>" girer
    And login butonuna basar
    And  Sayfaya giris yapilamadigi test edilir
    And  sayfayi kapatir


    Examples:
    |username|            |sifre|
    |Manager5|            |Manager5!|
    |Manager6|            |Manager6!|
    |Manager7|            |Manager7!|
    |Hakan   |            |Dag      |

