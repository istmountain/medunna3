
@ikisi
Feature: US1001 Amazon Search sayfasinda arama yapar


  Scenario: TC01 kullanici amazonda kelime aratir
    Given Kullanici amazon anasayfasinda
    Then  kullanici amazon sayfasinda Nutella arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir




  Scenario: TC02 kullanici amazonda kelime aratir
    Given  Kullanici amazon anasayfasinda
    Then   kullanici amazon sayfasinda Java arama yapar
    And   sonuclarin Java icerdigini test eder
    And   sayfayi kapatir

  Scenario: TC03 kullanici amazonda kelime aratir
    When Kullanici amazon anasayfasinda
    And   kullanici amazon sayfasinda iphone icin arama yapar
    Then  sonuclarin iphone icerdigini test eder
    And   sayfayi kapatir

