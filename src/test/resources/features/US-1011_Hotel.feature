Feature: US-1011 kullanici dogru kullanici adi ve sifre ile giris yapabilmeli


  Scenario: TC-08 pozitif login test


    Given Kullanici "hotel_my_camp" anasayfasinda
    Then login yazisina tiklar
    And Gecerli username girer
    And Gecerli password girer
    And login butonuna basar
    And Sayfaya giris yaptigini kontrol eder
    And  sayfayi kapatir

    Scenario: TC-09 dinamik
      Given Kullanici "hotel_my_camp" anasayfasinda
      Then login yazisina tiklar
      And Gecerli  "hotelValidUsername" girer
      And Gecerli "hotelValidPassword" girerr
      And login butonuna basar
      And Sayfaya giris yaptigini kontrol eder
      And  sayfayi kapatir


      Scenario: 3 adet negatif test senaryosu olusturalim
      # bu ihtimaller cogaltilabilir yanlis sifre girilir 1 negatif test yanlis username girilir 2. negatif test
        # yanlis username yanlis sifre girilir 3. negatif test case olur

        Given Kullanici "hotel_my_camp" anasayfasinda
        Then login yazisina tiklar
        And Gecersiz bir username girilir
        And  Gecersiz password girilir
        And login butonuna basar
        And Sayfaya giris yapilamadigi test edilir
        And  sayfayi kapatir




