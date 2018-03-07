package org.javacord.entity.permission;

import org.javacord.util.FactoryBuilder;

/**
 * A class to create {@link Permissions permissions} objects.
 */
public class PermissionsBuilder {

    /**
     * The permissions factory used by this instance.
     */
    private final PermissionsFactory factory;

    /**
     * Creates a new permissions builder with all types set to {@link PermissionState#NONE}.
     */
    public PermissionsBuilder() {
        factory = FactoryBuilder.createPermissionsFactory();
    }

    /**
     * Creates a new permissions builder with the states of the given permissions object.
     *
     * @param permissions The permissions which should be copied.
     */
    public PermissionsBuilder(Permissions permissions) {
        factory = FactoryBuilder.createPermissionsFactory(permissions);
    }

    /**
     * Sets the new state of the given type.
     *
     * @param type The type to change.
     * @param state The state to set.
     * @return The current instance in order to chain call methods.
     */
    public PermissionsBuilder setState(PermissionType type, PermissionState state) {
        factory.setState(type, state);
        return this;
    }

    /**
     * Gets the state of the given type.
     *
     * @param type The type to check.
     * @return The state of the given type.
     */
    public PermissionState getState(PermissionType type) {
        return factory.getState(type);
    }

    /**
     * Creates a {@link Permissions} instance with the given values.
     *
     * @return The created permissions instance.
     */
    public Permissions build() {
        return factory.build();
    }

}
