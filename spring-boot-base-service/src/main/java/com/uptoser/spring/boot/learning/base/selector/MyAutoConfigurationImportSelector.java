package com.uptoser.spring.boot.learning.base.selector;

import com.uptoser.spring.boot.learning.base.selector.ImportSelectorTestEntity1;
import com.uptoser.spring.boot.learning.base.selector.ImportSelectorTestEntity2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigurationImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{ImportSelectorTestEntity1.class.getName(), ImportSelectorTestEntity2.class.getName()};
    }
}
