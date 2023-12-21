/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.autoconfigure.ollama;

import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Ollama Chat autoconfiguration properties.
 *
 * @author Christian Tzolov
 * @since 0.8.0
 */
@ConfigurationProperties(OllamaChatProperties.CONFIG_PREFIX)
public class OllamaChatProperties {

	public static final String CONFIG_PREFIX = "spring.ai.ollama.chat";

	/**
	 * Enable Ollama Chat Client. True by default.
	 */
	private boolean enabled = true;

	/**
	 * Ollama Chat model name. Defaults to 'llama2'.
	 */
	private String model = "llama2";

	/**
	 * Client lever Ollama options. Use this property to configure model temperature, topK
	 * and topP and alike parameters. The null values are ignored defaulting to the
	 * model's defaults.
	 */
	private OllamaOptions options = new OllamaOptions();

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public OllamaOptions getOptions() {
		return this.options;
	}

}
