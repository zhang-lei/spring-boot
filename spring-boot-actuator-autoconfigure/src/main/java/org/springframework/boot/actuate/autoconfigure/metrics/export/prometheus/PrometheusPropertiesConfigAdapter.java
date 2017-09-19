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

package org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus;

import java.time.Duration;

import io.micrometer.prometheus.PrometheusConfig;

import org.springframework.boot.actuate.autoconfigure.metrics.export.PropertiesConfigAdapter;

/**
 * Adapter to convert {@link PrometheusProperties} to a {@link PrometheusConfig}.
 *
 * @author Jon Schneider
 * @author Phillip Webb
 */
class PrometheusPropertiesConfigAdapter
		extends PropertiesConfigAdapter<PrometheusProperties, PrometheusConfig>
		implements PrometheusConfig {

	private static final PrometheusConfig DEFAULTS = (key) -> null;

	PrometheusPropertiesConfigAdapter(PrometheusProperties properties) {
		super(properties, DEFAULTS);
	}

	@Override
	public String get(String key) {
		return null;
	}

	@Override
	public boolean descriptions() {
		return get(PrometheusProperties::getDescriptions, PrometheusConfig::descriptions);
	}

	@Override
	public Duration timerPercentilesMin() {
		return get(PrometheusProperties::getTimerPercentilesMin,
				PrometheusConfig::timerPercentilesMin);
	}

	@Override
	public Duration timerPercentilesMax() {
		return get(PrometheusProperties::getTimerPercentilesMax,
				PrometheusConfig::timerPercentilesMax);
	}

}
