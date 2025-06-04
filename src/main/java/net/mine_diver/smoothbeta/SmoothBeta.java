package net.mine_diver.smoothbeta;

import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.mod.entrypoint.EventBusPolicy;
import net.modificationstation.stationapi.api.util.Namespace;
import org.apache.logging.log4j.Logger;

@Entrypoint(eventBus = @EventBusPolicy(registerStatic = false, registerInstance = false))
public class SmoothBeta {
    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    public static final Logger LOGGER = NAMESPACE.getLogger();
}
