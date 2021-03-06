/**
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Object/I_.java.ftl
 *		Template version	   1.0
 *  At                  2018-05-12 14:33:49 PDT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.chat.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.models.chat.canon.IExchangeEnvelopeEntity;

/**
 * Facade for Object ObjectSchema(ExchangeEnvelope)
 *
 * Envelope to wrap meta data around each payload sent through the system, and therefore should only contain transient data. The ExchangeEnvelope will be available to every component in the message bus, but <b>SHOULD NOT</b> be persisted outside of that.
 * Generated from ObjectSchema(ExchangeEnvelope) at #/components/schemas/ExchangeEnvelope
 */
@Immutable
public interface IExchangeEnvelope
  extends IExchangeEnvelopeEntity
{
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */