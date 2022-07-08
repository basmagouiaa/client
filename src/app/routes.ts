import { Routes } from "@angular/router";
import { ClientComponent } from "./client/client.component";
import { AddClientComponent } from './add-client/add-client.component';
export const allAppRoutes: Routes = [
  { path: '', component: ClientComponent },
  {path:'add-client',component:AddClientComponent}
];