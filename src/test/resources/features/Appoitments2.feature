Feature: Appointment test
 @Dataappoitment
  Scenario: appoitment data read
   Given kullanici appoitments isin get request yapar
   Then kullanici appotiments bilgilerini desarialize eder
   Then kullanici appitments bilgilerini validate eder


