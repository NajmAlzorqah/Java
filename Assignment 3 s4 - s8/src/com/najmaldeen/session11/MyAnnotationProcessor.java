//package com.najmaldeen.session11;
//
//
//// Import the relevant classes
//import javax.annotation.processing.AbstractProcessor;
//import javax.annotation.processing.Filer;
//import javax.annotation.processing.RoundEnvironment;
//import javax.annotation.processing.SupportedAnnotationTypes;
//import javax.annotation.processing.SupportedSourceVersion;
//import javax.lang.model.SourceVersion;
//import javax.lang.model.element.TypeElement;
//import javax.tools.StandardLocation;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Set;
//// Annotate the processor class with supported annotation types and
////source version
//@SupportedAnnotationTypes("com.example.MyAnnotation")
//@SupportedSourceVersion(SourceVersion.RELEASE_8)
//public class MyAnnotationProcessor extends AbstractProcessor {
//    // Override the process method
//    @Override
//    public boolean process(Set<? extends TypeElement> annotations,
//                           RoundEnvironment roundEnv) {
//        // Get the filer instance from the processing environment
//        Filer filer = processingEnv.getFiler();
//        // Loop through the annotations
//        for (TypeElement annotation : annotations) {
//            // Get the annotated elements of type class
//            Set<? extends Element> annotatedElements = roundEnv.
//                    getElementsAnnotatedWith(annotation);
//            // Loop through the annotated elements
//            for (Element element : annotatedElements) {
//                // Get the name of the element
//                String name = element.getSimpleName().toString();
//                // Create a file named Hello.txt in the same
////package as the element
//                try (PrintWriter writer = new PrintWriter(filer.
//                        createResource(StandardLocation.SOURCE_OUTPUT,element.getEnclosingElement().toString(), "Hello.txt").openWriter()))
//                {
//                    // Write Hello World to the file
//                    writer.println("Hello World");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return true;
//    }
//}