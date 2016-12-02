# Nuxeo DAM Studio Test
===

This plugin provides a custom test features ([https://doc.nuxeo.com/x/LIAO](https://doc.nuxeo.com/x/LIAO)) to ease unit testing of your Studio project when DAM is activated.

The feature is called `StudioDamFeature` and includes `PlatformFeature` and `AutomationFeature`. The list of packages deployed is based on a real life dam use case but it may require adjustments.

Here is an example of how it can be used:

```

@RunWith(FeaturesRunner.class)
@Features({StudioDamFeature.class})
@Deploy({"studio.extensions.fvadon-SANDBOX"})
public class TestFVadonSandbox {
    @Inject
    CoreSession session;

    @Inject
    AutomationService as;

    protected DocumentModel domain;

    @Test
    public void isServiceDeployed() {
        assertNotNull(as);
    }

    @Before
    public void initRepo() throws Exception {
        session.removeChildren(session.getRootDocument().getRef());
        session.save();

        domain = session.createDocumentModel("/", "Assets", "Domain");
        domain.setPropertyValue("dc:title", "Assets");
        domain = session.createDocument(domain);
        session.save();
        domain = session.getDocument(domain.getRef());

    }

}

```



# Build

Assuming [maven](http://maven.apache.org/) (3.2.1) is installed on your system, execute the following:

```
cd /path/to/nuxeo-labs-dam-studio-test
mvn install
```
See our [Core Developer Guide](http://doc.nuxeo.com/x/B4BH) for instructions and guidelines.



# About the Nuxeo Platform


The [Nuxeo Platform](http://www.nuxeo.com/products/content-management-platform/) is an open source customizable and extensible content management platform for building business applications. It provides the foundation for developing document management, digital asset management and case management application. You can easily add features using ready-to-use addons or by extending the platform using its extension point system.

The Nuxeo Platform is developed and supported by Nuxeo, with contributions from the community.

# Licensing

Most of the source code in the Nuxeo Platform is copyright Nuxeo SA and
contributors, and licensed under the GNU Lesser General Public License v2.1.

See the documentation page [Licenses](http://doc.nuxeo.com/x/gIK7) for details.

# About Nuxeo

Nuxeo dramatically improves how content-based applications are built, managed and deployed, making customers more agile, innovative and successful. Nuxeo provides a next generation, enterprise ready platform for building traditional and cutting-edge content oriented applications. Combining a powerful application development environment with SaaS-based tools and a modular architecture, the Nuxeo Platform and Products provide clear business value to some of the most recognizable brands including Verizon, Electronic Arts, Sharp, FICO, the U.S. Navy, and Boeing. Nuxeo is headquartered in New York and Paris. More information is available at [www.nuxeo.com](http://www.nuxeo.com).
