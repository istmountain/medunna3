Feature: US1013 Kullanici excel bilgilerine ulasir
  @baskentler
  Scenario: TC18 kullanici excel bilgilerini kullanir
   # 1) Yeni bir class olusturalim
   #2) Baskentler excelini framework’e ekleyelim ve excelle ilgili islemleri yaparak
    Given kullanici dosyayi kullanilabilir hale getirelim
    Then - 1.satirdaki 2.hucreyi yazdirir
    Then - baskenti Jakarta olan ulke ismini yazdiralim
    Then - Ulke sayisinin 190 oldugunu test eder
    And - fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder