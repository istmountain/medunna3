Feature: Test API
  @RoomGet

   Scenario: Room API testi
   Given kullanici roomlar icin get request yapar
   And kullanici gelen room datayi deserialize eder
   Then kullanici room datasini validate eder

    @RoomPost
    Scenario: post talebi dogrulama
    Given kullanici roomlar icin post request yapar
    Then kullanici roomlar icin post request dogrulama yapar

     @RoomPut
    Scenario: put yapma
     Given kullanici roomlar icin put request yapar

     Then kullanici roomlar icin put request dogrulama yapar

      @DeleteRequest
      Scenario Outline: delete rooms
       Given kullanici roomlar icin delete request yapar "<id>"
       Then  delete validation

        Examples: test data (ids)
         |id|
       |28476|



