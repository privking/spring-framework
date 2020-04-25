package priv.king.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;

/**
 * @author king
 * TIME: 2020/4/11 - 23:12
 **/
public class Main2 {
	public static void main(String[] args) throws IOException {
		CachingMetadataReaderFactory readerFactory = new CachingMetadataReaderFactory();
		// 下面两种初始化方式都可，效果一样
		//MetadataReader metadataReader = readerFactory.getMetadataReader(Temp.class.getName());
		MetadataReader metadataReader = readerFactory.getMetadataReader(new ClassPathResource("priv/king/resource/Temp.class"));

		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		Resource resource = metadataReader.getResource();

		System.out.println(classMetadata); // org.springframework.core.type.classreading.SimpleAnnotationMetadata@41906a77
		System.out.println(annotationMetadata); // org.springframework.core.type.classreading.SimpleAnnotationMetadata@41906a77
		System.out.println(resource); // class path resource [priv/king/resource/Temp.class]

	}
}
