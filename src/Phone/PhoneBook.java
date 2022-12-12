package Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    ArrayList<Phone> phoneList = new ArrayList<>();
    Map<String, String> phoneMapping = new HashMap<>();

    public void simpanTelp(String nomor, String nama) {
        Phone phone = new Phone(nomor, nama);
        phoneList.add(phone);
    }

    public void referensiNegara() {
        phoneMapping.put("+62", "Indo");
        phoneMapping.put("+60", "Malay");
        phoneMapping.put("+44", "UK");
    }

    public void cetakNegara() {
        Collections.reverse(phoneList);

        for (Phone phone : phoneList) {
            String kode = phone.nomor.substring(0, 3);

            if (!phoneMapping.containsKey(kode)) {
                System.out.println("EO");
            } else System.out.println(phone + "negara=" + phoneMapping.get(kode));

//            if (phoneMapping.get(kode) == null)

        }
    }
}