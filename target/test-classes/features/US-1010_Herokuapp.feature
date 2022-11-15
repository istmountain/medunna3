Feature: US-1010 Herokuapp Delete testi

 @heroku
  Scenario: Herokuapp da delete butonu calismali

      Given Kullanici "herokuappUrl" anasayfasinda
      Then AddRemoveElement butonuna tiklar
      And  AddElement butonunu tiklar
      And Delete butonu gorunur oluncaya kadar bekler
      And Delete butonunun gorunur oldugunu test eder
      And Delete butonuna basarak butonu silin
      And Delete butonunun gorunmedigini test edin