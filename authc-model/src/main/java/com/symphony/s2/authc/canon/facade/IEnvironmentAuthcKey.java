/**
 * Copyright 2020 Symphony Communication Services, LLC.
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
 *  At                  2020-06-05 10:07:40 BST
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.s2.authc.canon.facade;

import java.security.PublicKey;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.fugue.kv.IKvItem;
import com.symphony.oss.models.core.canon.facade.ISystemObject;
import com.symphony.s2.authc.canon.IEnvironmentAuthcKeyEntity;

/**
 * Facade for Object ObjectSchema(EnvironmentAuthcKey)
 *
 * An RSA Public Key for an environment, this is the key the new standard JWTs are signed with.
 * Generated from ObjectSchema(EnvironmentAuthcKey) at #/components/schemas/EnvironmentAuthcKey
 */
@Immutable
public interface IEnvironmentAuthcKey
  extends ISystemObject, IEnvironmentAuthcKeyEntity, IKvItem
{
  /**
   * 
   * @return The public key.
   */
  PublicKey getPublicKey();

  /**
   * 
   * @return The key ID (SHA-1 hash of the key in Base64)
   */
  KeyId getKeyId();
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */