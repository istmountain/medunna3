Feature: kullanici data ekleyebilmeli

  @outline
  Scenario Outline: TC-15 5 farkli kayit ekleyin
    

    Given Kullanici "editor_datatablesUrl" anasayfasinda
    Then  new butonuna tiklar
    And isim bolumune "<isim>" girer
    And soyisim bolumune "<soyisim>" girer
    And pozisyon bolumune "<pozisyon>" girer
    And office bolumune sehir "<sehir>" adi girer
    And Extension bolumune "<extension>" adi girilir
    And startdate bolumune "<startdate>" girilir
    And salary bolumune "<salary>" girilir
    And  create butonuna tiklar
    And kullanici 2 saniye bekler
    When kullanici "<isim>" ile arama yapar
    And kullanici 2 saniye bekler
    And  isim bolumunde "<isim>" oldugunu dogrular
    And kullanici 2 saniye bekler
    And sayfayi kapatir

    Examples:
    |isim   | |soyisim | |pozisyon   | |sehir   | |extension| |startdate| |salary |
    |alim   | |Dinc    | |okul muduru| |Ardahan | |manager  | |1990-01-01| |1000 |
    |berk   | |dokuzcan| |ogrenci    | |Kadikoy | |IT       | |2010-01-01| |5000 |
    |huseyin| |ozturk  | |ogretmen   | |Trabzon | |Maths    | |2000-01-01| |500  |
    |fatih  | |bozkurt | |magento    | |maltepe | |Word     | |1994-01-01 | |2000 |
    |hakan  | |dag     | |qe         | |Augsburg| |Ue       | |1996-01-01 | |2000 |

