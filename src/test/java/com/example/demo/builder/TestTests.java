package com.example.demo.builder;

import com.example.demo.build.IabNamespaceMapper;
import com.example.demo.xmldto.Answer;
import com.example.demo.xmldto.Question;
import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import net.iab.videosuite.vast.VAST;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTests {

	@Test
	public void test1() {
		try {
			File file = new File("sample/test/question.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Question que= (Question) jaxbUnmarshaller.unmarshal(file);

			System.out.println(que.getId()+" "+que.getQuestionname());
			System.out.println("Answers:");
			List<Answer> list=que.getAnswers();
			for(Answer ans:list)
				System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test2() throws JAXBException, FileNotFoundException {
		JAXBContext contextObj = JAXBContext.newInstance(Question.class);

		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Answer ans1=new Answer(101,"java is a programming language","ravi");
		Answer ans2=new Answer(102,"java is a platform","john");

		ArrayList<Answer> list=new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);

		Question que=new Question(1,"What is java?",list);
		marshallerObj.marshal(que, new FileOutputStream("sample/test/question2.xml"));
	}

	@Test
	public void test3() {
		try {
			File file = new File("sample/test/sample.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(VAST.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			VAST vast= (VAST) jaxbUnmarshaller.unmarshal(file);

			System.out.println("test");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Autowired
	private IabNamespaceMapper iabNamespaceMapper;

	@Test
	public void test4() throws JAXBException, FileNotFoundException {
		JAXBContext jaxbContext = JAXBContext.newInstance(VAST.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", iabNamespaceMapper);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		marshaller.setProperty(CharacterEscapeHandler.class.getName(), (CharacterEscapeHandler) (ac, i, j, flag, writer) -> writer.write( ac, i, j ));

		VAST vast = new VAST();
		vast.setVersion("3.0");

		VAST.Ad ad = new VAST.Ad();
		ad.setId("1");

		vast.getAd().add(ad);

		marshaller.marshal(vast, new FileOutputStream("sample/test/sample2.xml"));

	}


}
