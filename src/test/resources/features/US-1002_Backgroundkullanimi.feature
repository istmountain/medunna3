@ikisi
Feature: 1002 kullanici ortak adimlari Backgroundla calistirir

  Background: ortak adim

    Given Kullanici amazon anasayfasinda

   Scenario: Nutella icin arama yapar
   Then kullanici amazon sayfasinda Nutella arama yapar
     And sonuclarin Nutella icerdigini test eder
     And sayfayi kapatir

     Scenario:  Java icin arama yapar
       Then kullanici amazon sayfasinda Java arama yapar
       And sonuclarin Java icerdigini test eder
       And sayfayi kapatir
