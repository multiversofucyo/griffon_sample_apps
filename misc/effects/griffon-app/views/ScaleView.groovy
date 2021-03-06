import griffon.effects.Anchor

actions {
    action(id: 'runAction',
        name: 'Run',
        enabled: bind{!parentModel.animating},
        closure: controller.runEffect)
}

panel(id: 'box') {
    migLayout(layoutConstraints: 'fill')
    label('From (percentage):')
    textField(columns: 20, constraints: 'span 2, wrap',
        text: bind('from', target: model, mutual: true))

    label('To (percentage):')
    textField(columns: 20, constraints: 'span 2, wrap',
        text: bind('to', target: model, mutual: true))

    label('Scale')
    checkBox('X', selected: bind('scaleX', target: model, mutual: true))
    checkBox('Y', selected: bind('scaleY', target: model, mutual: true), constraints: 'wrap')

    label('Anchor')
    comboBox(items: Anchor.collect{it.name()}, id: 'anchor', constraints: 'span 2, wrap')
    bean(model, anchor: bind{anchor.selectedItem})

    separator(constraints: 'grow, span 3, wrap')

    label('Duration:')
    textField(columns: 20, constraints: 'span 2, wrap',
        text: bind('duration', target: model, mutual: true))

    label('Delay:')
    textField(columns: 20, constraints: 'span 2, wrap',
        text: bind('delay', target: model, mutual: true))

    button(runAction, constraints: 'span3, right')
}
