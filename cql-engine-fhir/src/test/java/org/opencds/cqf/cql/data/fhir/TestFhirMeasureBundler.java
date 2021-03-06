package org.opencds.cqf.cql.data.fhir;

import org.cqframework.cql.elm.execution.Library;
import org.opencds.cqf.cql.execution.Context;
import org.opencds.cqf.cql.execution.CqlLibraryReader;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

/**
 * Created by Bryn on 5/7/2016.
 */
public class TestFhirMeasureBundler {
    //@Test
    public void TestCBP() throws IOException, JAXBException {
        File xmlFile = new File(URLDecoder.decode(TestFhirLibrary.class.getResource("library-cbp.elm.xml").getFile(), "UTF-8"));
        Library library = CqlLibraryReader.read(xmlFile);

        Context context = new Context(library);

        //FhirDataProvider provider = new FhirDataProvider().withEndpoint("http://fhirtest.uhn.ca/baseDstu3");
        //FhirDataProvider provider = new FhirDataProvider().withEndpoint("http://fhir3.healthintersections.com.au/open/");
        FhirDataProvider provider = new FhirDataProvider().withEndpoint("http://wildfhir.aegis.net/fhir");
        context.registerDataProvider("http://hl7.org/fhir", provider);

        FhirMeasureBundler bundler = new FhirMeasureBundler();
        org.hl7.fhir.dstu3.model.Bundle bundle = bundler.bundle(context, "BP: Systolic", "BP: Diastolic");

        assertThat(bundle.getEntry().size(), greaterThan(0));
    }
}
