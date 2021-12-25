package blockchains.iaas.uni.stuttgart.demo;

import blockchains.iaas.uni.stuttgart.de.api.IAdapterExtenstion;
import blockchains.iaas.uni.stuttgart.de.api.interfaces.BlockchainAdapter;
import org.pf4j.*;

import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // only read jar
//        PluginManager pluginManager = new DefaultPluginManager() {
//
//            @Override
//            protected PluginLoader createPluginLoader() {
//                // load only jar plugins
//                return new JarPluginLoader(this);
//            }
//
//            @Override
//            protected PluginDescriptorFinder createPluginDescriptorFinder() {
//                // read plugin descriptor from jar's manifest
//                return new ManifestPluginDescriptorFinder();
//            }
//
//        };

       final PluginManager pluginManager = new DefaultPluginManager(Paths.get("plugins"));
       //{
//
//            protected ExtensionFinder createExtensionFinder() {
//                DefaultExtensionFinder extensionFinder = (DefaultExtensionFinder) super.createExtensionFinder();
//                extensionFinder.addServiceProviderExtensionFinder(); // to activate "HowdyGreeting" extension
//                return extensionFinder;
//            }
//
//        };
        System.out.println("Runtime mode: " + pluginManager.getRuntimeMode());
        pluginManager.loadPlugins();
        pluginManager.startPlugins();

        List<IAdapterExtenstion> greetings = pluginManager.getExtensions(IAdapterExtenstion.class);

        for (IAdapterExtenstion greeting : greetings) {
            BlockchainAdapter a = greeting.getAdapter("http://localhost:7545", 2);
            System.out.println(">>> " + a.testConnection());
        }
    }
}
