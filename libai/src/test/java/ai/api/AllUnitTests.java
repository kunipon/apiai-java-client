package ai.api;

/***********************************************************************************************************************
 *
 * API.AI Java SDK - client-side libraries for API.AI
 * =================================================
 *
 * Copyright (C) 2016 by Speaktoit, Inc. (https://www.speaktoit.com)
 * https://www.api.ai
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************/

import ai.api.model.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ai.api.util.ParametersConverterTest;

@RunWith(Suite.class)
@SuiteClasses({
	AIConfigurationTest.class,
	AIResponseTest.class,
	ParametersConverterTest.class,
	AIServiceContextBuilderTest.class,
	FulfillmentTest.class,
	MetadataTest.class,
	ResponseMessageTest.class,
	ParamsDateTest.class,
	AIEventTest.class,
	AIDataServiceTest.class
	})
public class AllUnitTests {

}
