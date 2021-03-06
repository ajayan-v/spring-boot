/*
 * Copyright 2012-2017 the original author or authors.
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

package org.springframework.boot.context.embedded;

/**
 * Strategy interface for customizing auto-configured embedded reactive servers. Any beans
 * of this type will get a callback with the server factory before the server itself is
 * started, so you can set the port, address, error pages etc.
 * @author Brian Clozel
 * @since 2.0.0
 */
@FunctionalInterface
public interface ReactiveWebServerCustomizer {

	/**
	 * Customize the specified {@link ConfigurableReactiveWebServer}.
	 * @param server the server to customize
	 */
	void customize(ConfigurableReactiveWebServer server);
}
