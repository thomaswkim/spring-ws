/*
 * Copyright 2006 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.soap.saaj.saaj12;

import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;

import org.springframework.ws.soap.SoapEnvelope;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

/**
 * SAAJ 1.2 specific implementation of the <code>SoapMessage</code> interface. Accessed via the
 * <code>SaajSoapMessageContext</code>.
 *
 * @author Arjen Poutsma
 * @see javax.xml.soap.SOAPMessage
 * @see org.springframework.ws.soap.saaj.SaajSoapMessageContext
 */
class Saaj12SoapMessage extends SaajSoapMessage {

    public Saaj12SoapMessage(SOAPMessage soapMessage) {
        super(soapMessage);
    }

    protected SoapEnvelope createSaajSoapEnvelope(SOAPEnvelope saajEnvelope) {
        return new Saaj12SoapEnvelope(saajEnvelope);
    }

}
