package utilities;

import pojos.Appointments2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToText2 {

     public static void saveAppointmentData(Appointments2[] appointments){

        try {
 FileWriter filewriter = new FileWriter(ConfigurationReader.getProperty("appointment2_records"),false);

   BufferedWriter bw = new BufferedWriter(filewriter);

            for (int i = 0; i <appointments.length ; i++) {

                bw.append(appointments[i]+"\n");

            }
          bw.close();


        }catch (Exception e){
            e.printStackTrace();
        }

     }

}
