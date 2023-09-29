package com.research.EncryptWithJasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EncryptWithJasyptApplicationTests {

	@Test
	void contextLoads() {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("s3cre3tK3y");

		String encryptedText = encryptor.encrypt("Lorem Ipsum");
		System.out.println("Teks Terenkripsi: " + encryptedText);

		String decryptedText = encryptor.decrypt(encryptedText);
		System.out.println("Teks Terdekripsi: " + decryptedText);

		Assertions.assertEquals("Lorem Ipsum", decryptedText);

	}

}
