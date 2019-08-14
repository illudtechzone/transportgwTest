import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { TransportappgatewaySharedLibsModule, TransportappgatewaySharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [TransportappgatewaySharedLibsModule, TransportappgatewaySharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [TransportappgatewaySharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class TransportappgatewaySharedModule {
    static forRoot() {
        return {
            ngModule: TransportappgatewaySharedModule
        };
    }
}
