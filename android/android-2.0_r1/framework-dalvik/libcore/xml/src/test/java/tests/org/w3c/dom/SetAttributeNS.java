/*
 This Java source file was generated by test-to-java.xsl
 and is a derived work from the source document.
 The source document contained the following notice:



 Copyright (c) 2001 World Wide Web Consortium, 
 (Massachusetts Institute of Technology, Institut National de
 Recherche en Informatique et en Automatique, Keio University).  All 
 Rights Reserved.  This program is distributed under the W3C's Software
 Intellectual Property License.  This program is distributed in the 
 hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
 PURPOSE.  

 See W3C License http://www.w3.org/Consortium/Legal/ for more details.


 */

package tests.org.w3c.dom;

import dalvik.annotation.TestTargets;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetNew;
import dalvik.annotation.TestTargetClass;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.DOMException;
import org.w3c.dom.Attr;

import javax.xml.parsers.DocumentBuilder;

/**
 * The "setAttributeNS(namespaceURI,qualifiedName,Value)" method raises a
 * INVALID_CHARACTER_ERR DOMException if the specified prefix contains an
 * illegal character.
 * 
 * Attempt to add a new attribute on the first employee node. An exception
 * should be raised since the "qualifiedName" has an invalid character.
 * 
 * @author NIST
 * @author Mary Brady
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-258A00AF')/constant[@name='INVALID_CHARACTER_ERR'])">http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-258A00AF')/constant[@name='INVALID_CHARACTER_ERR'])</a>
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-ElSetAttrNS">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-ElSetAttrNS</a>
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-ElSetAttrNS')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='INVALID_CHARACTER_ERR'])">http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-ElSetAttrNS')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='INVALID_CHARACTER_ERR'])</a>
 */
@TestTargetClass(Element.class) 
public final class SetAttributeNS extends DOMTestCase {

    DOMDocumentBuilderFactory factory;

    DocumentBuilder builder;

    protected void setUp() throws Exception {
        super.setUp();
        try {
            factory = new DOMDocumentBuilderFactory(DOMDocumentBuilderFactory
                    .getConfiguration1());
            builder = factory.getBuilder();
        } catch (Exception e) {
            fail("Unexpected exception" + e.getMessage());
        }
    }

    protected void tearDown() throws Exception {
        factory = null;
        builder = null;
        super.tearDown();
    }

    /**
     * Runs the test case.
     * 
     * @throws Throwable
     *             Any uncaught exception causes test to fail
     */
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies DOMException with INVALID_CHARACTER_ERR code.",
        method = "setAttributeNS",
        args = {java.lang.String.class, java.lang.String.class, java.lang.String.class}
    )
    public void testSetAttributeNS1() throws Throwable {
        String namespaceURI = "http://www.nist.gov";
        String qualifiedName = "emp:qual?name";
        Document doc;
        NodeList elementList;
        Node testAddr;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("employee");
        testAddr = elementList.item(0);

        {
            boolean success = false;
            try {
                ((Element) /* Node */testAddr).setAttributeNS(namespaceURI,
                        qualifiedName, "newValue");
            } catch (DOMException ex) {
                success = (ex.code == DOMException.INVALID_CHARACTER_ERR);
            }
            assertTrue("throw_INVALID_CHARACTER_ERR", success);
        }
    }
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies DOMException with NAMESPACE_ERR code.",
        method = "setAttributeNS",
        args = {java.lang.String.class, java.lang.String.class, java.lang.String.class}
    )
    public void testSetAttributeNS2() throws Throwable {
        String namespaceURI = "http://www.nist.gov";
        String qualifiedName = "emp:";
        Document doc;
        NodeList elementList;
        Node testAddr;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("emp:employee");
        testAddr = elementList.item(0);

        {
            boolean success = false;
            try {
                ((Element) /* Node */testAddr).setAttributeNS(namespaceURI,
                        qualifiedName, "newValue");
            } catch (DOMException ex) {
                success = (ex.code == DOMException.NAMESPACE_ERR);
            }
            assertTrue("throw_NAMESPACE_ERR", success);
        }
    }

// Assumes validation.
//    public void testSetAttributeNS3() throws Throwable {
//        String namespaceURI = "www.xyz.com";
//        String qualifiedName = "emp:local1";
//        Document doc;
//        NodeList genderList;
//        Node gender;
//        NodeList genList;
//        Node gen;
//        NodeList gList;
//        Element genElement;
//        int nodeType;
//        doc = (Document) load("staffNS", builder);
//        genderList = doc.getElementsByTagName("gender");
//        gender = genderList.item(2);
//        genList = gender.getChildNodes();
//        gen = genList.item(0);
//        nodeType = (int) gen.getNodeType();
//
//        if (1 == nodeType) {
//            gen = doc.createEntityReference("ent4");
//            assertNotNull("createdEntRefNotNull", gen);
//        }
//        gList = gen.getChildNodes();
//        genElement = (Element) gList.item(0);
//        assertNotNull("notnull", genElement);
//
//        {
//            boolean success = false;
//            try {
//                genElement.setAttributeNS(namespaceURI, qualifiedName,
//                        "newValue");
//            } catch (DOMException ex) {
//                success = (ex.code == DOMException.NO_MODIFICATION_ALLOWED_ERR);
//            }
//            assertTrue("throw_NO_MODIFICATION_ALLOWED_ERR", success);
//        }
//    }
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies positive functionality.",
        method = "setAttributeNS",
        args = {String.class, String.class, String.class}
    )
    public void testSetAttributeNS4() throws Throwable {
        Document doc;
        NodeList elementList;
        Node testAddr;
        Attr addrAttr;
        String resultAttr;
        String resultNamespaceURI;
        String resultLocalName;
        String resultPrefix;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("emp:address");
        testAddr = elementList.item(0);
        assertNotNull("empAddrNotNull", testAddr);
        ((Element) /* Node */testAddr).setAttributeNS("http://www.nist.gov",
                "newprefix:zone", "newValue");
        addrAttr = ((Element) /* Node */testAddr).getAttributeNodeNS(
                "http://www.nist.gov", "zone");
        resultAttr = ((Element) /* Node */testAddr).getAttributeNS(
                "http://www.nist.gov", "zone");
        assertEquals("attrValue", "newValue", resultAttr);
        resultNamespaceURI = addrAttr.getNamespaceURI();
        assertEquals("nsuri", "http://www.nist.gov", resultNamespaceURI);
        resultLocalName = addrAttr.getLocalName();
        assertEquals("lname", "zone", resultLocalName);
        resultPrefix = addrAttr.getPrefix();
        assertEquals("prefix", "newprefix", resultPrefix);
    }
    
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies positive functionality.",
        method = "setAttributeNS",
        args = {java.lang.String.class, java.lang.String.class, java.lang.String.class}
    )
    public void testSetAttributeNS5() throws Throwable {
        String localName = "newAttr";
        String namespaceURI = "http://www.newattr.com";
        String qualifiedName = "emp:newAttr";
        Document doc;
        NodeList elementList;
        Node testAddr;
        
        String resultAttr;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("emp:address");
        testAddr = elementList.item(0);
        assertNotNull("empAddrNotNull", testAddr);
        ((Element) /* Node */testAddr).setAttributeNS(namespaceURI,
                qualifiedName, "<newValue>");
        resultAttr = ((Element) /* Node */testAddr).getAttributeNS(
                namespaceURI, localName);
        assertEquals("throw_Equals", "<newValue>", resultAttr);
    }
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies DOMException with NAMESPACE_ERR code.",
        method = "setAttributeNS",
        args = {java.lang.String.class, java.lang.String.class, java.lang.String.class}
    )
    public void testSetAttributeNS6() throws Throwable {
        String namespaceURI = "http://www.nist.gov";
        String qualifiedName = "xml:qualifiedName";
        Document doc;
        NodeList elementList;
        Node testAddr;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("employee");
        testAddr = elementList.item(0);

        {
            boolean success = false;
            try {
                ((Element) /* Node */testAddr).setAttributeNS(namespaceURI,
                        qualifiedName, "newValue");
            } catch (DOMException ex) {
                success = (ex.code == DOMException.NAMESPACE_ERR);
            }
            assertTrue("throw_NAMESPACE_ERR", success);
        }
    }
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies DOMException with NAMESPACE_ERR.",
        method = "setAttributeNS",
        args = {java.lang.String.class, java.lang.String.class, java.lang.String.class}
    )
    public void testSetAttributeNS7() throws Throwable {
        String namespaceURI = "http://www.nist.gov";
        String qualifiedName = "xmlns";
        Document doc;
        NodeList elementList;
        Node testAddr;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("employee");
        testAddr = elementList.item(0);

        {
            boolean success = false;
            try {
                ((Element) /* Node */testAddr).setAttributeNS(namespaceURI,
                        qualifiedName, "newValue");
            } catch (DOMException ex) {
                success = (ex.code == DOMException.NAMESPACE_ERR);
            }
            assertTrue("throw_NAMESPACE_ERR", success);
        }
    }
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies positive functionality.",
        method = "setAttributeNS",
        args = {java.lang.String.class, java.lang.String.class, java.lang.String.class}
    )
    public void testSetAttributeNS9() throws Throwable {
        String localName = "newAttr";
        String namespaceURI = "http://www.newattr.com";
        String qualifiedName = "emp:newAttr";
        Document doc;
        NodeList elementList;
        Node testAddr;
        Attr addrAttr;
        String resultAttr;
        String resultNamespaceURI;
        String resultLocalName;
        String resultPrefix;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("emp:address");
        testAddr = elementList.item(0);
        assertNotNull("empAddrNotNull", testAddr);
        ((Element) /* Node */testAddr).setAttributeNS(namespaceURI,
                qualifiedName, "newValue");
        addrAttr = ((Element) /* Node */testAddr).getAttributeNodeNS(
                namespaceURI, localName);
        resultAttr = ((Element) /* Node */testAddr).getAttributeNS(
                namespaceURI, localName);
        assertEquals("attrValue", "newValue", resultAttr);
        resultNamespaceURI = addrAttr.getNamespaceURI();
        assertEquals("nsuri", "http://www.newattr.com", resultNamespaceURI);
        resultLocalName = addrAttr.getLocalName();
        assertEquals("lname", "newAttr", resultLocalName);
        resultPrefix = addrAttr.getPrefix();
        assertEquals("prefix", "emp", resultPrefix);
    }
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "Verifies DOMException with NAMESPACE_ERR code.",
        method = "setAttributeNS",
        args = {java.lang.String.class, java.lang.String.class, java.lang.String.class}
    )
    public void testSetAttributeNS10() throws Throwable {
        String namespaceURI = "http://www.example.gov";
        Document doc;
        NodeList elementList;
        Node testAddr;
        doc = (Document) load("hc_staff", builder);
        elementList = doc.getElementsByTagName("em");
        testAddr = elementList.item(0);

        {
            boolean success = false;
            try {
                ((Element) /* Node */testAddr).setAttributeNS(namespaceURI, "",
                        "newValue");
            } catch (DOMException ex) {
                success = (ex.code == DOMException.NAMESPACE_ERR);
            }
            assertTrue("throw_NAMESPACE_ERR", success);
        }
    }
}
