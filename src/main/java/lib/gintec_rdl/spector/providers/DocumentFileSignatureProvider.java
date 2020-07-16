package lib.gintec_rdl.spector.providers;

import lib.gintec_rdl.spector.FileSignature;
import lib.gintec_rdl.spector.FileSignatureProviderImpl;
import lib.gintec_rdl.spector.ResourceFileSignatureProvider;

import java.util.List;

public final class DocumentFileSignatureProvider extends FileSignatureProviderImpl {
    private static final String NAME = "DocumentFileSignatureProvider";
    private final ResourceFileSignatureProvider delegateProvider;

    public DocumentFileSignatureProvider() {
        delegateProvider = new ResourceFileSignatureProvider("spector/signatures/images/document-signatures.json");
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public List<FileSignature> getSignatures() {
        return delegateProvider.getSignatures();
    }
}
