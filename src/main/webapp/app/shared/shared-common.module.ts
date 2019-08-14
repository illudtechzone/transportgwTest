import { NgModule } from '@angular/core';

import { TransportappgatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [TransportappgatewaySharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [TransportappgatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TransportappgatewaySharedCommonModule {}
