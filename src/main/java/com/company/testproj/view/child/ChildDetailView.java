package com.company.testproj.view.child;

import com.company.testproj.entity.Child;

import com.company.testproj.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "children/:id", layout = MainView.class)
@ViewController("tp1_Child.detail")
@ViewDescriptor("child-detail-view.xml")
@EditedEntityContainer("childDc")
public class ChildDetailView extends StandardDetailView<Child> {
}