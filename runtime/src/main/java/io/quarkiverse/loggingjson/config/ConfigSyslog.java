package io.quarkiverse.loggingjson.config;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.smallrye.config.WithDefault;

@ConfigGroup
public interface ConfigSyslog extends ConfigFormatter {
    /**
     * Determine whether to enable the JSON syslog formatting extension, which disables "normal" console formatting.
     */
    @WithDefault("true")
    boolean enabled();

    default boolean isEnabled() {
        return enabled();
    }
}
